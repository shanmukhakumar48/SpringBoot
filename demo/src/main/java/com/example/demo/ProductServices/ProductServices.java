package com.example.demo.ProductServices;

import java.util.List;

import com.example.demo.product;

public interface ProductServices {

		List<product> findAll();
		product save(product p);
		product getproductbyid(long id);
		product updateproduct(long id, product pro);
		void delectproduct(long id);
		List<product> getproductbyid();
	}


