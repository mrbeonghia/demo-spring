package com.codegym.demo.controller;

import com.codegym.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //đây là controller
public class DemoController {
    @Autowired
    ProductService productService;
    @GetMapping("/home") //xử lý phương thức get vs đường dẫn là "/home"
    public String demo(){
        productService.save();
        return "home";
    }

    @RequestMapping("/home") //ánh xạ các request tới các action tương ứng của controller
    public String getValue(){
        return "redirect:/yasuo";
    }

    @GetMapping("/yasuo")
    public String yasuo(){
        return "yasuo";
    }
}
