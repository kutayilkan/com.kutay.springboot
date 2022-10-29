package com.kutay.springboot.business.abstracts;

import java.util.List;

import com.kutay.springboot.entities.concretes.Product;

public interface IProductService {

	List<Product> getAll();

}
