package com.kutay.springboot.apiControlllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kutay.springboot.business.abstracts.IProductService;
import com.kutay.springboot.entities.concretes.Product;

@RestController
@RequestMapping(value="api/products")
public class ProductRestService {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping(value="/getAll")
	public List<Product> getAll(){
		return productService.getAll();
	}

	public IProductService getProductService() {
		return productService;
	}

}
