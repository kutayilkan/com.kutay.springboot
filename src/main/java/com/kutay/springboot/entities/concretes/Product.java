package com.kutay.springboot.entities.concretes;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Product {
	private int id;
	private int categoryId;
	private String productName;
	private BigDecimal unitPrice;
	private short unitsInStock;
	private String quantityPerUnit;
	
}
