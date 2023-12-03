package com.model;

import javax.persistence.Entity;

@Entity
public class Product {
	private int id;
	private String name;
	private String imageurl;
	private int rating;
	private int price;
	private int qty;
	private int rqty;
	private String cateogry;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String imageurl, int price, int qty, String cateogry, int rqty,int rating) {
		super();
		this.name = name;
		this.imageurl = imageurl;
		this.rating=rating;
		this.price = price;
		this.qty = qty;
		this.cateogry = cateogry;
		this.rqty = rqty;
	}
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
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public int  getRating() {
		return this.rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getCateogry() {
		return cateogry;
	}
	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}
	public int getRqty() {
		return rqty;
	}
	public void setRqty(int rqty) {
		this.rqty = rqty;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", imageurl=" + imageurl + ", rating=" + rating + ", price="
				+ price + ", qty=" + qty + ", rqty=" + rqty + ", cateogry=" + cateogry + "]";
	}
	
	
}