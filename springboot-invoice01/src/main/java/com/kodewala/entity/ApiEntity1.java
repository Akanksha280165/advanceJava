package com.kodewala.entity;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "springBootInvoice1_DB")
public class ApiEntity1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoiceCount;
	@Column
	private int invoiceValue;
	private String invoiceNote;
	private String invoiceGSTNumber;
	private String invoiceStatus;
	private String invoiceDescription;
	
	
	public int getInvoiceCount() {
		return invoiceCount;
	}
	public void setInvoiceCount(int invoiceCount) {
		this.invoiceCount = invoiceCount;
	}
	public int getInvoiceValue() {
		return invoiceValue;
	}
	public void setInvoiceValue(int invoiceValue) {
		this.invoiceValue = invoiceValue;
	}
	public String getInvoiceNote() {
		return invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}
	public String getInvoiceGSTNumber() {
		return invoiceGSTNumber;
	}
	public void setInvoiceGSTNumber(String invoiceGSTNumber) {
		this.invoiceGSTNumber = invoiceGSTNumber;
	}
	public String getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getInvoiceDescription() {
		return invoiceDescription;
	}
	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}
	
	
}
