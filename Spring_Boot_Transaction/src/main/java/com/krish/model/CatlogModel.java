package com.krish.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Catlog_Details")
@Data
public class CatlogModel {

	@Id
	@Column(name="Prod_ID")
	private int id;
	private String prodname;
	private int price;
	private int quantity;
}
