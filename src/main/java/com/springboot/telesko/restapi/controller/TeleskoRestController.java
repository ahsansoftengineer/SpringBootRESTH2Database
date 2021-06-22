package com.springboot.telesko.restapi.controller;

import com.springboot.telesko.restapi.model.Alien;
import com.springboot.telesko.restapi.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("teleskorest")
public class TeleskoRestController {

    @Autowired
    AlienRepository alienRepository;

    // ModelAndView is the Latest way of Exchanging data between Model and Servlet
    @RequestMapping("alienform")
    public ModelAndView alienform(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alienform.jsp");
        return mv;
    }
    // id=1&name=Ibrahim&tech=DotNet&laptop.id=1&laptop.name=HP&laptop.configuration=Corei7
    @RequestMapping("addalien")
    public ModelAndView addAlien(Alien alien){
        alienRepository.save(alien);
        ModelAndView mv = new ModelAndView();
        mv.addObject("alien", alien);
        mv.setViewName("alien.jsp");
        return mv;
    }
}
