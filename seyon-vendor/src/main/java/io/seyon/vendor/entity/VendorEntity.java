package io.seyon.vendor.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="vendor_master")
public class VendorEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2928013624958426495L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Size(min = 3, message = "Please enter the Vendor name")
	@Column(nullable=false)
	String name;
	
	@Size(min = 3, message = "Please enter the Contact Person name")
	@Column(nullable=true)
	String contactPerson;
	
	@Column(nullable=true)
	String email;
	
	@Size(min = 3, message = "Please enter the Address")
	@Column(nullable=false)
	String addrLine1;
	
	@Column
	String addrLine2;
	
	@Size(min = 3, message = "Please enter the City")
	@Column(nullable=false)
	String city;
	
	@Size(min = 2, message = "Please enter the State")
	@Column(nullable=false)
	String state;
	
	@Column
	String stateCode;
	
	@Size(min = 6, max = 6, message = "Please enter the Pincode")
	@Column(name="pin_code", nullable=false)
	String pincode;

	@Size(min = 10, max = 12, message = "Please enter the Primary phone")
	@Column(nullable=false)
	String phonePrimary;

	@Column(nullable=true)
	String phoneSecondary;
	
	@Column(nullable=true)
	String faxNo;

	
	@Column(nullable=true)
	String pan;
	
	
	@Column(nullable=true)
	String gstin;
	
	@Column(nullable=true)
	String ServiceTaxRegNo;
	
	@Column(nullable=false)
	Long companyId;

	@Column(nullable=false)
	String active="Y";
	
	@Column(nullable=true)
	Date createDate= new Date();;
	
	@Column(nullable=true)
	String createdBy;
	
	@Column
	private String vendorBankAcctNo;
	
	@Column
	private String vendorBankName;
	
	@Column
	private String vendorBankBranch;

	@Column
	private String vendorBankBranchIfscCode;
	
	@Column
	private String companyStatus;
	
	@Column
	private String vendorBankBranchSwiftCode;
	
	@Column
	private String bankAcctType;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhonePrimary() {
		return phonePrimary;
	}

	public void setPhonePrimary(String phonePrimary) {
		this.phonePrimary = phonePrimary;
	}

	public String getPhoneSecondary() {
		return phoneSecondary;
	}

	public void setPhoneSecondary(String phoneSecondary) {
		this.phoneSecondary = phoneSecondary;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getServiceTaxRegNo() {
		return ServiceTaxRegNo;
	}

	public void setServiceTaxRegNo(String serviceTaxRegNo) {
		ServiceTaxRegNo = serviceTaxRegNo;
	}


	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}


	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	
	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVendorBankAcctNo() {
		return vendorBankAcctNo;
	}

	public void setVendorBankAcctNo(String vendorBankAcctNo) {
		this.vendorBankAcctNo = vendorBankAcctNo;
	}

	public String getVendorBankName() {
		return vendorBankName;
	}

	public void setVendorBankName(String vendorBankName) {
		this.vendorBankName = vendorBankName;
	}

	public String getVendorBankBranch() {
		return vendorBankBranch;
	}

	public void setVendorBankBranch(String vendorBankBranch) {
		this.vendorBankBranch = vendorBankBranch;
	}

	public String getVendorBankBranchIfscCode() {
		return vendorBankBranchIfscCode;
	}

	public void setVendorBankBranchIfscCode(String vendorBankBranchIfscCode) {
		this.vendorBankBranchIfscCode = vendorBankBranchIfscCode;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getVendorBankBranchSwiftCode() {
		return vendorBankBranchSwiftCode;
	}

	public void setVendorBankBranchSwiftCode(String vendorBankBranchSwiftCode) {
		this.vendorBankBranchSwiftCode = vendorBankBranchSwiftCode;
	}

	public String getBankAcctType() {
		return bankAcctType;
	}

	public void setBankAcctType(String bankAcctType) {
		this.bankAcctType = bankAcctType;
	}

	@Override
	public String toString() {
		return "VendorEntity [id=" + id + ", name=" + name + ", contactPerson=" + contactPerson + ", email=" + email
				+ ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", city=" + city + ", state=" + state
				+ ", stateCode=" + stateCode + ", pincode=" + pincode + ", phonePrimary=" + phonePrimary
				+ ", phoneSecondary=" + phoneSecondary + ", faxNo=" + faxNo + ", pan=" + pan + ", gstin=" + gstin
				+ ", ServiceTaxRegNo=" + ServiceTaxRegNo + ", companyId=" + companyId + ", active=" + active
				+ ", createDate=" + createDate + ", createdBy=" + createdBy + ", vendorBankAcctNo=" + vendorBankAcctNo
				+ ", vendorBankName=" + vendorBankName + ", vendorBankBranch=" + vendorBankBranch
				+ ", vendorBankBranchIfscCode=" + vendorBankBranchIfscCode + ", companyStatus=" + companyStatus
				+ ", vendorBankBranchSwiftCode=" + vendorBankBranchSwiftCode + ", bankAcctType=" + bankAcctType + "]";
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	
	
	

}
