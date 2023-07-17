package com.example.demo.Implements;

import java.util.List;



import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.product;
import com.example.demo.ProductRepository.ProductRepository;
import com.example.demo.ProductServices.ProductServices;
@Service
public class ProductImpl implements ProductServices {
    
	@Autowired
	private ProductRepository repository;
	@Override
	public List<product> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public product save(product p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}
	public List<product> getproductbyid(){
		return repository.findAll();
	}
	
	public product getproductbyid(long id) {
		return repository.findById(id).get();
	}
	
	public product updateproduct(long id, product pro) {
		
		product p=repository.findById(id).get();
		if(Objects.nonNull(pro.getName()) && !"".equalsIgnoreCase(null)) {
			p.setName(pro.getName());
		}
		
		if(Objects.nonNull(pro.getCategory()) && !"".equalsIgnoreCase(null)){
			p.setCategory(pro.getCategory());
		}
		if(Objects.nonNull(pro.getCost()) && !"".equalsIgnoreCase(null)){
			p.setCost(pro.getCost());
		}
      return repository.save(p);
	}
	@Override
	public void delectproduct(long id) {
		repository.deleteById(id);
	}

}