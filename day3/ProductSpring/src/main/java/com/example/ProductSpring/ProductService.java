package com.example.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

//    List<Product> products = new ArrayList<>();
//    ProductDB db = new ProductDB();

    public void addProduct(Product p) {
//        products.add(p);
        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Optional<Product> getProduct(String name){
        return db.findByName(name).stream().findFirst();
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        List<Product> products = db.findAll();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;

    }

    // Assignment-2 Part-1
    // It is fairly similar to the above methods, so I don't think it needs any explanation and same goes for part 2

    public List<Product> getProductWithPlace(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        List<Product> products = db.findAll();

        for(Product p: products){
            String place = p.getPlace().toLowerCase();
            if(place.contains(str))
                prods.add(p);
        }
        return prods;
    }

    // Assignment-2 Part-2

    public List<Product> getProductWithWarranty(int date) {
        List<Product> prods = new ArrayList<>();
        List<Product> products = db.findAll();

        for(Product p: products){
            int warranty = p.getWarranty();
            if(warranty == date){
                prods.add(p);
            }

        }
        return prods;
    }

}