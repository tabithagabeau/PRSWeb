package com.prs.business.product;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.prs.business.vendor.Vendor;

@Entity
public class Product  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="vendorID")
	private Vendor vendor; 
	private String vendorPartNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;
	
	public Product() {
		//empty constructor
	}

	

	public Product(int id, Vendor vendor, String vendorPartNumber, String name, double price, String unit,
			String photoPath) {
		super();
		this.id = 0;
		this.vendor= vendor;
		this.vendorPartNumber = vendorPartNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}


	public String getVendorPartNumber() {
		return vendorPartNumber;
	}

	public void setVendorPartNumber(String vendorPartNumber) {
		this.vendorPartNumber = vendorPartNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhootoPath() {
		return photoPath;
	}

	public void setPhootoPath(String phootoPath) {
		this.photoPath = phootoPath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code =\" + code + \",  vendorPartNumber="  + vendorPartNumber + ", name="
				+ name + ", price=" + price + ", unit=" + unit + ", photoPath=" + photoPath + "]"; //vendorID=" + vendor.getSummary()+ ",
	}
	
	

}
