package com.kutay.springboot.dataAccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kutay.springboot.entities.concretes.Product;

public interface IProductDao extends JpaRepository<Product, Integer> {

	
}