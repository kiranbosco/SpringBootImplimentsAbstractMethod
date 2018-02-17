package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@RequestMapping(value="/postData",method=RequestMethod.GET)
	
	public void getProducts() {
		
		TestClass testClass =new TestClass();
		List<Product> listProduct=testClass.createModel();
		
		for(Product product : listProduct) {
			System.out.println("AGE    :"+product.getId());
			System.out.println(" NAME :"+product.getName());
		}
		
	}
	

}
