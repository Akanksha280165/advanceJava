package com.kodewala.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taxInvoice_db")
public class InvoiceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerCount;
	private String  productPrice;
	private String  productPaymentStatus;
	private String  cutomerBill;
	private String  customerGst;
	private String  customerSst;
	private String  Invoice;
	
	
	public Integer getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(Integer customerCount) {
		this.customerCount = customerCount;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductPaymentStatus() {
		return productPaymentStatus;
	}
	public void setProductPaymentStatus(String productPaymentStatus) {
		this.productPaymentStatus = productPaymentStatus;
	}
	public String getCutomerBill() {
		return cutomerBill;
	}
	public void setCutomerBill(String cutomerBill) {
		this.cutomerBill = cutomerBill;
	}
	public String getCustomerGst() {
		return customerGst;
	}
	public void setCustomerGst(String customerGst) {
		this.customerGst = customerGst;
	}
	public String getCustomerSst() {
		return customerSst;
	}
	public void setCustomerSst(String customerSst) {
		this.customerSst = customerSst;
	}
	public String getInvoice() {
		return Invoice;
	}
	public void setInvoice(String invoice) {
		Invoice = invoice;
	}
	
}