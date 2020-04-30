package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.cg.entity.Product;



@Transactional
@Repository
public class ProductDaoImp implements ProductDaoI {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Product p) {
		em.persist(p);
	}

	@Override
	public Product findProductById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public List retrieve() {
		
		Query q=em.createQuery("from Product p");
		return q.getResultList();
	}

	@Override
	public void updateProduct(Product product) {
		Product newProduct = em.find(Product.class, product.getProduct_ID());
		
		if(newProduct != null)
		{
		newProduct.setProduct_ID(product.getProduct_ID());
		newProduct.setName(product.getName());
		newProduct.setQuantity(product.getQuantity());
		newProduct.setMRP(product.getMRP());
		newProduct.setManufacturer(product.getManufacturer());
		newProduct.setProduct_size(product.getProduct_size());
		newProduct.setImg_path(product.getImg_path());
		}
		
	}

	@Override
	public void deleteProduct(int productId) {
		Product product = em.find(Product.class, productId);
		em.remove(product);
		
	}

}
