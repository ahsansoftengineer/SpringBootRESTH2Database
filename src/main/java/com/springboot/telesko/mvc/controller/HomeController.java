package com.springboot.telesko.mvc.controller;

import com.springboot.telesko.mvc.pojo.Alien;
import com.springboot.telesko.mvc.pojo.Laptop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {
    @RequestMapping("home")
//    @ResponseBody // Required when you want to some data
    public String home(){
//        Prefix / Suffix provided in Application.properties file
//        return  "home.html";
        return "home.html";
    }
    @RequestMapping("index")
    public String index(){
        return  "index.jsp";
    }


    @RequestMapping("image")
    public String image(){
        return  "kyo.jpg";

    }
    @RequestMapping("alien")
    public Alien alien(){
        return  new Alien(1, "Asan", "C#", new Laptop(1, "HP", "Core i7"));

    }

}
