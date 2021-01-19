package com.cognizant.truyum.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao
{
	private static HashMap<Long, Cart> userCarts=null;
	public CartDaoCollectionImpl()
	{
		if(userCarts==null)
			userCarts=new HashMap<Long, Cart>();
	}
	public void addCartItem(long userId, long menuItemId) throws ParseException, ClassNotFoundException, IOException, SQLException
	{
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		if(userCarts.containsKey(userId))
		{
			Cart cart=userCarts.get(userId);
			List<MenuItem> list = cart.getMenuItemList();
			list.add(menuItem);
			cart.setMenuItemList(list);
			userCarts.put(userId, cart);
		}
		else
		{
			Cart cart=new Cart(new ArrayList<MenuItem>(), 0);
			List<MenuItem> list=cart.getMenuItemList();
			list.add(menuItem);
			cart.setMenuItemList(list);
			userCarts.put(userId, cart);
		}
		
	}
	public Cart getAllCartItems(long userId) throws CartEmptyException
	{
		Cart cart = userCarts.get(userId);
		List<MenuItem> list = cart.getMenuItemList();
		if(list==null)
			throw new CartEmptyException();
		else
		{
			double total = 0;
			for (MenuItem menuItem : list)
				total+=menuItem.getPrice();
			cart.setTotal(total);
		}
		return cart;
	}
	public void removeCartItem(long userId, long menuItemId)
	{
		Cart cart = userCarts.get(userId);
		List<MenuItem> list = cart.getMenuItemList();
		for (MenuItem menuItem : list)
		{
			if(menuItem.getId()==menuItemId)
			{
				list.remove(menuItem);
				break;
			}
			cart.setMenuItemList(list);
			userCarts.put(userId, cart);
		}
	}
}
