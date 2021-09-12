package com.poly.java5lab.controller.lab2;

import com.poly.java5lab.constant.ListConstant;
import com.poly.java5lab.entity.ProductEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Lab2Bai4Controller {
    @GetMapping("/lab2/bai4")
    public String bai4Page(){
        ProductEntity product = new ProductEntity();
        product.setName("product 1");
        product.setPrice(100000.0);
        ListConstant.products.add(product);
        return "views/lab2/lab2bai4";
    }

    @PostMapping("/lab2/bai4/save")
    public String bai4Save(ProductEntity product){
        ListConstant.products.add(product);
        return "views/lab2/lab2bai4";
    }

    @ModelAttribute("getItems")
    public List<ProductEntity> getItems() {
        return ListConstant.products;
    }

}
