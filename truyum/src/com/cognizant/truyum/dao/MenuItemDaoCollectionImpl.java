package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cognizant.truyum.util.DateUtil;
import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionImpl implements MenuItemDao
{	
	private static List<MenuItem> menuItemList = null;
	
	public MenuItemDaoCollectionImpl() throws ParseException
	{
		if(menuItemList == null)
		{
			menuItemList=new ArrayList<MenuItem>();
			menuItemList.add(new MenuItem(1, "Sandwich", (float) 99.0, true, DateUtil.convertToDate("15/03/2017"),
					"Main Course", true));
			menuItemList.add(new MenuItem(2, "Burger", (float) 129.0, true, DateUtil.convertToDate("23/12/2017"),
					"Main Course", false));
			menuItemList.add(new MenuItem(3, "Pizza", (float) 149.0, true, DateUtil.convertToDate("21/08/2018"),
					"Main Course", false));
			menuItemList.add(new MenuItem(4, "French Fries", (float) 57.0, false, DateUtil.convertToDate("02/07/2017"),
					"Starters", true));
			menuItemList.add(new MenuItem(5, "Chocolate Brownie", (float) 32.0, true,
					DateUtil.convertToDate("02/11/2022"), "Dessert", true));
		}
	}
	
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}
	
	public List<MenuItem> getMenuItemListCustomer()
	{
		List<MenuItem> l = new ArrayList<MenuItem>();
		for (MenuItem menuItem : menuItemList) {
			if (((menuItem.getDateOfLaunch()).equals(new Date()))
					|| (menuItem.getDateOfLaunch()).before(new Date()) && menuItem.isActive()) {
				l.add(menuItem);
			}
		}
		return l;
	}
	
	public void modifyMenuItem(MenuItem menuItem)
	{
		for (MenuItem firstinlist : menuItemList)
		{
			if(menuItem.equals(firstinlist))
			{
				menuItemList.remove(firstinlist);
				menuItemList.add(menuItem);
			}
		}
	}
	public MenuItem getMenuItem(long menuItemId)
	{
		for (MenuItem firstinlist : menuItemList)
		{
			if(firstinlist.getId()== menuItemId)
				return firstinlist;
		}
		return null;
	}
	
	

}
