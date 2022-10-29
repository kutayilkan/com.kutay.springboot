package com.kutay.springboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kutay.springboot.business.abstracts.IProductService;
import com.kutay.springboot.dataAccess.concretes.IProductDao;
import com.kutay.springboot.entities.concretes.Product;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProductDao productDao;

	@Override
	public List<Product> getAll() {
		return productDao.findAll();
	}

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

}
