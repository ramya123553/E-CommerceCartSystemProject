package com.example.ecommerce.services;

import com.example.ecommerce.dao.cartDao;
import com.example.ecommerce.models.Cart;
import com.example.ecommerce.models.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cartService {
    @Autowired
    private cartDao cartDao;

    public Cart addCart(Cart cart)
    {
        return cartDao.addCart(cart);
    }
//    public Cart getCart(int id)
//    {
//        return cartDao.getCart(id);
//    }
public List<Cart> getCarts(){
    return this.cartDao.getCarts();
}

    public void updateCart(Cart cart){
        cartDao.updateCart(cart);
    }
    public void deleteCart(Cart cart)
    {
        cartDao.deleteCart(cart);
    }



}
