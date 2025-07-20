package com.krish.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Order_Details")
@Data
public class BuyModel {

	@Id
	@Column(name = "Prod_ID")
	private int id;
	private int prodid;
	private String prodname;
	private int quantity;
	private double totalPrice;
	
}
