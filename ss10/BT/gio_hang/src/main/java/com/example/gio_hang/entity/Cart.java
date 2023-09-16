package com.example.gio_hang.entity;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product2,Integer>product2Map=new HashMap<>();
    public Map<Product2, Integer> getProducts() {
        return product2Map;
    }

    public void setProducts(Map<Product2, Integer> products) {
        this.product2Map = products;
    }

    public Cart(Map<Product2, Integer> products) {
        this.product2Map = products;
    }

    public Cart() {
    }

    private boolean isProductInCart(Product2 product) {
        for (Map.Entry<Product2, Integer> entry : product2Map.entrySet()) {
            if (entry.getKey().getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product2, Integer> selectProductInCart(Product2 product) {
        for (Map.Entry<Product2, Integer> entry : product2Map.entrySet()) {
            if (entry.getKey().getId() == product.getId()) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product2 product) {
        if (!isProductInCart(product)) {
            product2Map.put(product, 1);
        } else {
            Map.Entry<Product2, Integer> productInCart = selectProductInCart(product);
            if (productInCart != null) {
                int quantity = productInCart.getValue() + 1;
                product2Map.replace(productInCart.getKey(), quantity);
            }
        }
    }

    public void changeQuantity(Product2 product, int newQuantity) {
        if (!isProductInCart(product)) {
            product2Map.put(product, newQuantity);
        } else {
            Map.Entry<Product2, Integer> productInCart = selectProductInCart(product);
            if (productInCart != null) {
                if (newQuantity > 0) {
                    product2Map.replace(productInCart.getKey(), newQuantity);
                } else {
                    product2Map.remove(productInCart);
                }
            }
        }
    }

    public void deleteProduct(Product2 product) {
        Map.Entry<Product2, Integer> productInCart = selectProductInCart(product);
        if (productInCart != null) {
            product2Map.remove(productInCart.getKey());
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (Map.Entry<Product2, Integer> entry : product2Map.entrySet()) {
            total += entry.getValue() * entry.getKey().getPrices();
        }
        return total;
    }
}
