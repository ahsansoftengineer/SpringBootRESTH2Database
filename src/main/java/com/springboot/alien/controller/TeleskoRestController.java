package com.springboot.alien.controller;

import com.springboot.alien.model.Alien;
import com.springboot.alien.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("alien")
public class TeleskoRestController {

    @Autowired
    AlienRepository alienRepository;

    // ModelAndView is the Latest way of Exchanging data between Model and Servlet
    @RequestMapping("/form")
    public ModelAndView alienform(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alien/alienform.jsp");
        return mv;
    }
    // http://localhost:9090/teleskorest/alienupdate?id=1
    @RequestMapping("/update")
    public ModelAndView alienupdate(@RequestParam("id") Integer id){
        Alien alien =  alienRepository.findById(id).orElse(new Alien());
        System.out.println(alien);
        ModelAndView mv = new ModelAndView();
        mv.addObject("alien", alien);
        mv.setViewName("alien/alienupdate.jsp");
        return mv;
    }
    // id=1&name=Ibrahim&tech=DotNet&laptop.id=1&laptop.name=HP&laptop.configuration=Corei7
    @RequestMapping("/result")
    public ModelAndView addAlien(Alien alien){
        alienRepository.save(alien);
        System.out.println(alien);
        System.out.println("findByIdGreaterThan");
        System.out.println(alienRepository.findByIdGreaterThan(alien.getId() -1 ));
        System.out.println("findByName");
        System.out.println(alienRepository.findByName(alien.getName()));
        System.out.println("findByGender");
        System.out.println(alienRepository.findByGender(alien.getGender()));
        System.out.println("findByNameSorted");
        System.out.println(alienRepository.findByGenderSorted(alien.getGender()));
        ModelAndView mv = new ModelAndView();
        mv.addObject("alien", alien);
        mv.setViewName("alien/alien.jsp");
        return mv;
    }
}
