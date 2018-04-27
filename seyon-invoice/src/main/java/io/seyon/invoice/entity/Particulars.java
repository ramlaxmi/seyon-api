package io.seyon.invoice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Particulars implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4832964801051024812L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private Long invoiceId;
	@Column
	private String index;
	@Column
	private String item;
	@Column
	private String itemTaxCategory;
	@Column
	private Integer quantity;
	@Column
	private Integer cgstPercent;
	@Column
	private Integer sgstPercent;
	@Column
	private Integer igstPercent;
	@Column
	private Double calculatedAmount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getItemTaxCategory() {
		return itemTaxCategory;
	}
	public void setItemTaxCategory(String itemTaxCategory) {
		this.itemTaxCategory = itemTaxCategory;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getCgstPercent() {
		return cgstPercent;
	}
	public void setCgstPercent(Integer cgstPercent) {
		this.cgstPercent = cgstPercent;
	}
	public Integer getSgstPercent() {
		return sgstPercent;
	}
	public void setSgstPercent(Integer sgstPercent) {
		this.sgstPercent = sgstPercent;
	}
	public Integer getIgstPercent() {
		return igstPercent;
	}
	public void setIgstPercent(Integer igstPercent) {
		this.igstPercent = igstPercent;
	}
	public Double getCalculatedAmount() {
		return calculatedAmount;
	}
	public void setCalculatedAmount(Double calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
	@Override
	public String toString() {
		return "Particulars [id=" + id + ", invoiceId=" + invoiceId + ", index=" + index + ", item=" + item
				+ ", itemTaxCategory=" + itemTaxCategory + ", quantity=" + quantity + ", cgstPercent=" + cgstPercent
				+ ", sgstPercent=" + sgstPercent + ", igstPercent=" + igstPercent + ", calculatedAmount="
				+ calculatedAmount + "]";
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

}
