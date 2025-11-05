package com.tnsif.entityassignment;

public class Product {
	private int id;
    private String cname;
    private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", cname=" + cname + ", cost=" + cost + "]";
	}
	
	
}
