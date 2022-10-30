package com.kutay.springboot.apiControlllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kutay.springboot.business.abstracts.IProductService;
import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.entities.concretes.Product;

@RestController
@RequestMapping(value="api/products")
public class ProductRestService {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping(value="/getAll")
	public DataResult<List<Product>> getAll(){
		return productService.getAll();
	}
	
	@PostMapping(value="/add")
	public Result add(@RequestBody Product product){
		return productService.add(product);
	}
	
	@GetMapping(value="/getByProductNameAndCategoryId")
	public Result getByProductNameAndCategoryId(@RequestParam("productName") String productName, int categoryId){
		return productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping(value="/getAllByPagination")
	public DataResult<List<Product>> getAll(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize){
		return productService.getAll(pageNumber, pageSize);
	}
	
	@GetMapping(value="/getAllBySorted")
	public DataResult<List<Product>> getAll(@RequestParam String order){
		return productService.getAll(order);
	}

}
