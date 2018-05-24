package io.seyon.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import io.seyon.invoice.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>,JpaSpecificationExecutor<Invoice> {

}
