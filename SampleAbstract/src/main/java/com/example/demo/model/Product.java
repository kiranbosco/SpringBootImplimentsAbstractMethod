package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="model")
public class Product {

	@Id
	
	private int id;

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	private String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
