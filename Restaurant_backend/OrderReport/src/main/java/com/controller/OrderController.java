package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Order;
import com.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping("Order")
public class OrderController {
	
	@Autowired
	public  OrderService os;
    
	@PostMapping("saveOrderDetails/")
	public String saveOrderDetails(@RequestBody Order ord) {
		     int cid=ord.getOrderId();
		     String cname=ord.getUserName();
		     int productId=ord.getProductId();
		     String pname=ord.getProductName();
		     String cateogry=ord.getCateogry();
			return os.saveOrderDetails(cid, cname, productId, pname, cateogry);
	}
	
}
