package com.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.model.Product;
import com.repository.ProductRepository;

@Service
public class Productservice { 
	@Autowired
	private ProductRepository productRepository;
	public void  saveProductsData() {
		System.out.println();
		System.out.println();
		System.out.println("in service");
		try {
			String line="";
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Products2.csv"));
			while((line = br.readLine())!=null) {
				String data[] = line.split(",");
				
				System.out.println(data[0]);
				Product p = new Product();
				p.setName(data[0]);
				p.setImageurl(data[1]);
				p.setPrice(Integer.parseInt(data[2]));
				p.setQty(Integer.parseInt(data[3]));
				p.setCateogry(data[4]);
				p.setRating(Integer.parseInt(data[5]));
				System.out.println(data[4]);
				p.setRqty(1);
				
				Product p2 = productRepository.getByImageurl(p.getImageurl());
				if(p2 == null) {
					productRepository.save(p);
				}
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error Occured"+e);
		}
	}
	public List<Product> getallProducts(){
		return productRepository.findAll();
	}
	
	
	public List<Product> getProductBySearchName(String pname){
		return productRepository.getProductByName(pname);
	}
	public List<Product> getQtySortedProducts(){
		return productRepository.getQtySortedProducts();
	}
	
	public String updatePriceById(int pid ,int price) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			p.setPrice(price);
			productRepository.save(p);
			return "price update successfully";
		}
		else {
			return "price not updated";
		}
	}
	
	public String updateQtyById(int pid ,int qty) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			p.setQty(qty);
			productRepository.save(p);
			return "quantity update successfully";
		}
		else {
			return "quantity not updated";
		}
	}
	
	public String updateNameById(int pid ,String pname) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			p.setName(pname);
			productRepository.save(p);
			return "Product Name update successfully";
		}
		else {
			return "Product Name not updated";
		}
	}
	
	public String deleteProductById(int pid) {
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			productRepository.delete(p);
			return "Product deleted successfully";
		}
		else {
			return "Product not deleted";
		}
	}
}
