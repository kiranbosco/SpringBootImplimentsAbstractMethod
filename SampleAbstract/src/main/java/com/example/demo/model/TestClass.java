package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TestClass  implements ProductImpl{

	@Override
	public List<Product> createModel() {
		
		Product product=new Product(20,"Vijay");
		
		List<Product> list=new ArrayList<Product>();
		
		list.add(product);
		return list;
	}

}
