package com.org;

public class Items implements Comparable<Items>{
	private int id; // int -> Integer
	private String name;
	private double price; // double -> Double
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Items arg0) {
		// TODO Auto-generated method stub
		//return this.id - arg0.getId(); // returns an integer value either -ve or 0 or +ve
		//return (int)(this.price - arg0.getPrice());
		return this.name.compareTo(arg0.getName());
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
