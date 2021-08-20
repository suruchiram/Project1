package com.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.dao.CartDAO;
import com.dao.impl.CartDAOImpl;
import com.main.shop.model.Cart;
import com.repository.CartRepository;
import com.shop.exception.BusinessException;

public class CartService implements CartRepository {
	private static Logger log = Logger.getLogger(CartService.class);
	CartDAO cartDAO = new CartDAOImpl();

	@Override
	public List<Cart> viewCart() throws BusinessException {
		List<Cart> cartList=null ;
		
		
        
        return cartList;
		
		
		

	}

	@Override
	public int addProductToCart(Cart cart) throws BusinessException  {
		int sucessful=0;
		sucessful=cartDAO.addProductToCart(cart);
		
		
		return sucessful;
	}

}
