package io.seyon.invoice.resource;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.seyon.invoice.entity.Invoice;
import io.seyon.invoice.entity.InvoiceStatus;
import io.seyon.invoice.model.InvoiceData;
import io.seyon.invoice.model.InvoiceSearch;
import io.seyon.invoice.service.InvoiceService;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;

	private static final Logger log = LoggerFactory.getLogger(InvoiceController.class);

	@PostMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	public InvoiceData saveInvoice(@RequestBody InvoiceData invoiceData,
			@RequestHeader(name = "x-company-id", required = true) Long companyId,
			@RequestHeader(name = "x-user-name", required = true) String userId) {
		log.info("Invoice details request {}", invoiceData);

		invoiceData.getInvoice().setCompanyId(companyId);
		invoiceData.getInvoice().setCreatedBy(userId);
		invoiceData.getParticulars().forEach(p -> {
			p.setCompanyId(companyId);
			p.setCreatedBy(userId);
		});

		Long id = invoiceService.saveInvoice(invoiceData.getInvoice(), invoiceData.getParticulars());

		invoiceData.getInvoice().setId(id);
		invoiceData.getParticulars().forEach(p -> p.setInvoiceId(id));
		log.info("Invoice details response{}", invoiceData);
		return invoiceData;
	}

	@PostMapping(path = "/search", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	public Iterable<Invoice> searchInvoice(@RequestParam(required = false) Integer pageNumber,
			@RequestHeader(name = "x-company-id", required = true) Long companyId,
			@RequestBody InvoiceSearch invoiceSearch) {
		log.info(
				"Invoice Search Data pageNumber {},companyId {},"
						+ "invoiceId {},clientId {}, invoice Start Date {},Invoice end date {},invoice Status {}",
				pageNumber, companyId, invoiceSearch.getId(), invoiceSearch.getClientId(),
				invoiceSearch.getInvoiceStDate(), invoiceSearch.getInvoiceEdDate(), invoiceSearch.getStatus());

		if (null == pageNumber)
			throw new IllegalArgumentException("Page Number is null");
		if (companyId == null)
			throw new IllegalArgumentException("Company Id is null");
		if (null != invoiceSearch.getInvoiceStDate() && null == invoiceSearch.getInvoiceEdDate())
			throw new IllegalArgumentException("End date is null");
		if (null != invoiceSearch.getInvoiceEdDate() && null == invoiceSearch.getInvoiceStDate())
			throw new IllegalArgumentException("Start date is null");
		
		if(null!=invoiceSearch.getInvoiceEdDate() && null!=invoiceSearch.getInvoiceEdDate() && !invoiceSearch.getInvoiceStDate().equals(invoiceSearch.getInvoiceEdDate()) 
				&& invoiceSearch.getInvoiceEdDate().before(invoiceSearch.getInvoiceStDate())) {
			throw new IllegalArgumentException("End date is greater than start date");
		}

		return invoiceService.getInvoiceList(pageNumber, companyId, invoiceSearch.getId(), invoiceSearch.getClientId(),
				invoiceSearch.getInvoiceStDate(), invoiceSearch.getInvoiceEdDate(), invoiceSearch.getStatus());

	}

	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	public InvoiceData getInvoice(@RequestParam(required = true) Long invoiceId) {
		log.info("Invoice Search Data invoiceId {}", invoiceId);
		return invoiceService.getInvoiceDetails(invoiceId);

	}
}
