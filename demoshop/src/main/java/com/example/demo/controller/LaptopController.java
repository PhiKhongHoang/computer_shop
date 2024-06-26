package com.example.demo.controller;

import com.example.demo.entity.Laptop;
import com.example.demo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class LaptopController {
    private LaptopService laptopService;

    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/list")
    public String getAll(Model model){
        List<Laptop> laptops = laptopService.getAllLaptop();
        model.addAttribute("laptops", laptops);
        return "index";
    }
}
