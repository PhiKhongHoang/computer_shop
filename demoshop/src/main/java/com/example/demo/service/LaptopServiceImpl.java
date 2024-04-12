package com.example.demo.service;

import com.example.demo.entity.Laptop;
import com.example.demo.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService{
    private LaptopRepo laptopRepo;
    @Autowired
    public LaptopServiceImpl(LaptopRepo laptopRepo){
        this.laptopRepo = laptopRepo;
    }

    @Override
    public List<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }
}
