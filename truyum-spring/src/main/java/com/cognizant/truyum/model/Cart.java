package com.cognizant.truyum.model;
import java.util.*;
public class Cart 
{
	private List<MenuItem> menuItemList=new ArrayList<>();
	private double total;
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
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
	public Cart(List<MenuItem> menuItemList, double total) {
		setMenuItemList(menuItemList);
		setTotal(total);
	}
	

}
