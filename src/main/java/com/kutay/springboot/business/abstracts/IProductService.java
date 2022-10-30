package com.kutay.springboot.business.abstracts;

import java.util.List;

import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.entities.concretes.Product;

public interface IProductService {

	DataResult<List<Product>> getAll();

	Result add(Product product);

	DataResult<List<Product>> getByProductNameAndCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getAll(int pageNumber, int pageSize);

	DataResult<List<Product>> getAll(String order);
}
