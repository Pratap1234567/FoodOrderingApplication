package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.Productservice;

@RestController
@CrossOrigin
public class ProductController {
	@Autowired
	private Productservice productservice;
	
	@GetMapping(value="saveProducts")
	public void setdatainDB() {
		productservice.saveProductsData();
	}
	@GetMapping(value="getallProducts")
	public List<Product> getAllProducts(){
		System.out.println("all product called");
		return productservice.getallProducts();

	}
	
	@GetMapping(value="getProductBySearchName/{pname}")
	public List<Product> getProductBySearchName(@PathVariable("pname") String pname){
		return productservice.getProductBySearchName(pname);
	}
	
	@GetMapping(value="getQtySortedProducts")
	public List<Product> getQtySortedProducts() {
		return productservice.getQtySortedProducts();
	}
	
	@PutMapping(value="adminUpdateProductPrice/{pid}/{price}")
	public String adminUpdateProductPrice(@PathVariable("pid") int pid, @PathVariable("price") int price){
		return productservice.updatePriceById(pid,price);
	}
	
	@PutMapping(value="adminUpdateProductQty/{pid}/{qty}")
	public String adminUpdateProductQty(@PathVariable("pid") int pid, @PathVariable("qty") int qty){
		return productservice.updateQtyById(pid,qty);
	}
	
	@PutMapping(value="adminUpdateProductName/{pid}/{pname}")
	public String adminUpdateProductName(@PathVariable("pid") int pid, @PathVariable("pname") String pname){
		return productservice.updateNameById(pid,pname);
	}
	
	@DeleteMapping(value="deleteProductById/{pid}")
	public String deleteProductById(@PathVariable("pid") int pid) {
		return productservice.deleteProductById(pid);
	}
}
