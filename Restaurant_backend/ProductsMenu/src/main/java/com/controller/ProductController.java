package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Productservice;

@RestController
@CrossOrigin
public class ProductController {
	private Productservice productservice;
	
	@GetMapping(value="saveProducts")
	public void setdatainDB() {
		productservice.saveProductsData();
	}
}
