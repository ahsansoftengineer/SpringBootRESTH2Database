package com.springboot.factory.controller;

import com.springboot.factory.model.Factory;
import com.springboot.factory.repository.FactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// This example for Rest Controller
@RestController
@RequestMapping("factory")
public class FactoryRestController {
    @Autowired
    FactoryRepository factoryRepository;

    // Jackson library is responsible to convert Normal Object into JSON FORMAT
    @GetMapping("factory")
    public Iterable<Factory> employees(){
        return factoryRepository.findAll();
    }

    @GetMapping("factory/{id}")
    public Optional<Factory> employees(@PathVariable int id){
        return factoryRepository.findById(id);
    }

    @PostMapping(path = "factory")
    public Factory employeesAdd(@RequestBody Factory factory){
        System.out.println("Add");
        factoryRepository.save(factory);
        return factory;
    }

    @PutMapping(path = "factory")
    public Factory employeesUpdate(@RequestBody Factory factory){
        System.out.println("Update");
        factoryRepository.save(factory);
        return factory;
    }

    @DeleteMapping(path = "factory")
    public String employeesDelete(@RequestBody Factory factory){
        factoryRepository.delete(factory);
        return "Factory Deleted";
    }
}
