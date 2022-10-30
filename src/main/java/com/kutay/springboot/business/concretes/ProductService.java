package com.kutay.springboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kutay.springboot.business.abstracts.IProductService;
import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.core.utily.results.SuccessDataResult;
import com.kutay.springboot.core.utily.results.SuccessResult;
import com.kutay.springboot.dataAccess.concretes.IProductDao;
import com.kutay.springboot.entities.concretes.Product;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProductDao productDao;

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>> (productDao.findAll(), "Ürünler listelendi");
	}

	@Override
	public Result add(Product product) {
		productDao.save(product);
		return new SuccessResult("Ürün başarıyla kaydedildi!");
	}
	
	@Override
	public Result update(Product product) {
		return null;
	}

}
