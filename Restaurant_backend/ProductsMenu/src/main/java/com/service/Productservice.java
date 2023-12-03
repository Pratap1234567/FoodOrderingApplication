package com.service;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class Productservice { 
	private ProductRepository productRepository;
	public void  saveProductsData() {
		try {
			String line="";
			BufferedReader br = new BufferedReader(new FileReader("C://Users//pratap singh//Downloads/Product_Copy - Products"));
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
}
