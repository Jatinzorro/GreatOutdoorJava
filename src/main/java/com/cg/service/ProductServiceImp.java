package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDaoI;
import com.cg.dao.ProductDaoImp;
import com.cg.entity.Product;

@Service
public class ProductServiceImp implements ProductServiceI {
	
	@Autowired
	ProductDaoI product;

	@Override
	public void create(Product p) {
		product.create(p);
	}

	@Override
	public Product findProductById(int id) {
		return product.findProductById(id);
	}

	@Override
	public List retrieve() {
		return product.retrieve();
	}

	@Override
	public void updateProduct(Product p) {
			product.updateProduct(p);	
	}

	@Override
	public void deleteProduct(int productId) {
		product.deleteProduct(productId);
		
	}

}
