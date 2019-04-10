package io.seyon.voucher.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voucher implements Serializable {

	private static final long serialVersionUID = 2295915883765052507L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private Long companyId;

	@Column
	private String voucherId;
	
	@Column
	private Long vendorId;
	
	
	@Column
	private String headOfAccount;// head of account
	
	
	@Column
	private String particulars; // Field for description or Narration

	@Column
	private Double cgstAmount; // cgst Amount
	
	@Column
	private Double sgstAmount;// sgst Amount
	
	@Column
	private Double igstAmount;// igst Amount
	
	@Column
	private Double netAmount;// Net Amount
	
	@Column
	private Double tdsPercent; // TDS Percent
	
	@Column
	private Double tdsAmount; // TDS Amount
	
	@Column
	private Double others; // Other Amount
	
	@Column
	private Double totalNetAmount; // Total Net Amount
	
	@Column
	private Double totalAmount; // Total Amount
	
	@Column
	private String deductionRemark; //Deductions remarks
	
	@Column
	private Date voucherDate;

	@Column
	private String createdBy;

	@Column
	private Date createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getHeadOfAccount() {
		return headOfAccount;
	}

	public void setHeadOfAccount(String headOfAccount) {
		this.headOfAccount = headOfAccount;
	}

	public String getParticulars() {
		return particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public Double getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(Double cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public Double getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(Double sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public Double getIgstAmount() {
		return igstAmount;
	}

	public void setIgstAmount(Double igstAmount) {
		this.igstAmount = igstAmount;
	}

	public Double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}

	public Double getTdsPercent() {
		return tdsPercent;
	}

	public void setTdsPercent(Double tdsPercent) {
		this.tdsPercent = tdsPercent;
	}

	public Double getTdsAmount() {
		return tdsAmount;
	}

	public void setTdsAmount(Double tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	public Double getOthers() {
		return others;
	}

	public void setOthers(Double others) {
		this.others = others;
	}

	public Double getTotalNetAmount() {
		return totalNetAmount;
	}

	public void setTotalNetAmount(Double totalNetAmount) {
		this.totalNetAmount = totalNetAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDeductionRemark() {
		return deductionRemark;
	}

	public void setDeductionRemark(String deductionRemark) {
		this.deductionRemark = deductionRemark;
	}

	public Date getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(Date voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Voucher [id=" + id + ", companyId=" + companyId + ", voucherId=" + voucherId + ", vendorId=" + vendorId
				+ ", headOfAccount=" + headOfAccount + ", particulars=" + particulars + ", cgstAmount=" + cgstAmount
				+ ", sgstAmount=" + sgstAmount + ", igstAmount=" + igstAmount + ", netAmount=" + netAmount
				+ ", tdsPercent=" + tdsPercent + ", tdsAmount=" + tdsAmount + ", others=" + others + ", totalNetAmount="
				+ totalNetAmount + ", totalAmount=" + totalAmount + ", deductionRemark=" + deductionRemark
				+ ", voucherDate=" + voucherDate + ", createdBy=" + createdBy + ", createdDate=" + createdDate + "]";
	}

	

}
