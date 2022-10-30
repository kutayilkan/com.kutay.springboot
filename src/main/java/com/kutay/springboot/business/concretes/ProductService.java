package com.kutay.springboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kutay.springboot.business.abstracts.IProductService;
import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.core.utily.results.SuccessDataResult;
import com.kutay.springboot.core.utily.results.SuccessResult;
import com.kutay.springboot.dataAccess.abstracts.IProductDao;
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
	public DataResult<List<Product>> getByProductNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Ürünler listelendi");
	}
	
	@Override
	public DataResult<List<Product>> getAll(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber-1, pageSize);
		return new SuccessDataResult<List<Product>> (productDao.findAll(pageable).getContent(), "Ürünler listelendi");
	}
	
	@Override
	public DataResult<List<Product>> getAll(String order) {
		Sort sort;
		switch (order) {
		case "artan":
			sort = Sort.by(Sort.Direction.ASC, "productName");
			break;
		case "azalan":
			sort = Sort.by(Sort.Direction.DESC, "productName");
			break;
		default:
			sort = Sort.unsorted();
			break;
		}
		return new SuccessDataResult<List<Product>> (productDao.findAll(sort), "Ürünler listelendi");
	}
}
