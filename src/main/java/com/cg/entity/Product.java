package com.cg.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Product1")

public class Product {
	
	@Id
	int Product_ID;
	
	@Column
	String Name;
	
	@Column
	int Quantity;
	
	@Column
	int MRP;
	
	@Column
	String Manufacturer;
	
	@Column
	int Product_size;
	
	@Column
	String img_path;
	
	public Product() {
		
	}
	public Product(int product_ID, String name, int quantity, int mRP, String manufacturer, int product_size,
			String img_path) {
		super();
		Product_ID = product_ID;
		Name = name;
		Quantity = quantity;
		MRP = mRP;
		Manufacturer = manufacturer;
		Product_size = product_size;
		this.img_path = img_path;
	}

	public int getProduct_ID() {
		return Product_ID;
	}

	public void setProduct_ID(int product_ID) {
		Product_ID = product_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getMRP() {
		return MRP;
	}

	public void setMRP(int mRP) {
		MRP = mRP;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public int getProduct_size() {
		return Product_size;
	}

	public void setProduct_size(int product_size) {
		Product_size = product_size;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	
	
		
	
}
