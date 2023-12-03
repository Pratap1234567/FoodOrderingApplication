package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="OrderTable")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int userId;
	private String userName;
	private int productId;
	private String productName;
	private String cateogry;
	private Date order_date=new Date(System.currentTimeMillis());
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int userId, String userName, int productId, String productName, String cateogry) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.productId = productId;
		this.productName = productName;
		this.cateogry = cateogry;
	}
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", userName=" + userName + ", productId="
				+ productId + ", productName=" + productName + ", cateogry=" + cateogry + ", order_date=" + order_date
				+ "]";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCateogry() {
		return cateogry;
	}
	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	
	
}
