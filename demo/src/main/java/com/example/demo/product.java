package com.example.demo;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class product {
	@Id
	@SequenceGenerator(
			initialValue=100001,
			allocationSize=1,
			sequenceName="product_seq",
			name="product_seq"
			)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="product_seq")
	private long id;
	private String name;
	private String category;
	private double cost;
	public long getId() {
		return id;
	}
	
	public product() {}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", category=" + category + ", cost=" + cost + "]";
	}
	public product(long id, String name, String category, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
}