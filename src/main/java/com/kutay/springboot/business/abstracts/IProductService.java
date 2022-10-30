package com.kutay.springboot.business.abstracts;

import java.util.List;

import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.entities.concretes.Product;

public interface IProductService {

	DataResult<List<Product>> getAll();

	Result add(Product product);

	Result update(Product product);

}
