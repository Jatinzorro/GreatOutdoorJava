package com.cg.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Product;

@Service
public interface ProductServiceI {
	
	public void create(Product p);
	public Product findProductById(int id);
	public List retrieve();
	public void updateProduct(Product product);
	public void deleteProduct(int productId);
	

}
