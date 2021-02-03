package com.cognizant.truyum.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menuitems")
public class MenuItem 
{
	@Id
	@Column(name="id")
	private long id;
	
	@Id
	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="price")
	private float price;
	
	@Id
	@Column(name="active")
	private boolean active;
	
	@Id
	@Column(name="dateOfLaunch")
	private Date dateOfLaunch;
	
	@Id
	@Column(name="category")
	private String category;
	
	@Id
	@Column(name="freeDelivery")
	private boolean freeDelivery;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isFreeDelivery() {
		return freeDelivery;
	}
	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	public MenuItem(long id, String name, float price, boolean active, Date dateOfLaunch, String category, boolean freeDelivery) 
	{
		setId(id);
		setName(name);
		setPrice(price);
		setActive(active);
		setDateOfLaunch(dateOfLaunch);
		setCategory(category);
		setFreeDelivery(freeDelivery);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
