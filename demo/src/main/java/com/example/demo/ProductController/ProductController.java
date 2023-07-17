package com.example.demo.ProductController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product;
import com.example.demo.ProductServices.ProductServices;

@RestController
public class ProductController {
	@Autowired
	private ProductServices service;
	
	@PostMapping("/product")
	public product addproduct(@RequestBody product p) {
		return service.save(p);
	}
	
	@GetMapping("/product")
	public List<product> displayAllproducts(){
		return service.findAll();
	}
	@GetMapping("/product/{id}")
	public product getproductbyid(@PathVariable("id") long id){
		return service.getproductbyid(id);
	}
	@PutMapping("/product/{id}")
	public product updateproduct(@PathVariable("id")long id,@RequestBody product pro) {
	return service.updateproduct(id, pro);
	}
	@DeleteMapping("/product/{id}")
	public void deleteproduct(@PathVariable("id") long id) {
		service.delectproduct(id);
	}

}
