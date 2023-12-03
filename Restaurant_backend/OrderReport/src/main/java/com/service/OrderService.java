package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.model.Order;
import com.repository.OrderRepsitory;

@Service
public class OrderService {
		@Autowired
		private OrderRepsitory ordRepo;
		
		public String saveOrderDetails( int cid,String cname,int productId,String pname, String cateogry) {
			try {
				Order od =new Order(cid,cname,productId,pname,cateogry);
				ordRepo.save(od);
			}
			catch(Exception e) {
				return "Something went wrong Orderdetails not saved";
			}
			return "OrderDetails saved successfully";
		}
}
