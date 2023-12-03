package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public interface  ProductRepository extends JpaRepository<Product,Integer>{

	public Product getByImageurl(String imageurl);
	
	@Query("select p from Product p where p.name like concat('%',:pname,'%') ")
    public List<Product> getProductByName(@Param("pname")String pname);
	
	@Query("select p from Product p order by p.qty asc")
	public List<Product> getQtySortedProducts();
	
	
	
	
	
	
	
}
