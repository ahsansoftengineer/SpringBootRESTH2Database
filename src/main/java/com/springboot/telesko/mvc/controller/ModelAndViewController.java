package com.springboot.telesko.mvc.controller;

import com.springboot.telesko.mvc.pojo.Alien;
import com.springboot.telesko.mvc.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mv")
public class ModelAndViewController {

    // ModelAndView is the Latest way of Exchanging data between Model and Servlet
    @RequestMapping("index")
    public ModelAndView index(@RequestParam("name") String myName){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("index.jsp");
        return mv;
    }
    // Sending Complex Objects to Controller
    // /mv/home?id=1&name=Ibrahim&gender=Male
    @RequestMapping("home")
    public ModelAndView home(Employee employee){
        ModelAndView mv = new ModelAndView();
        mv.addObject("employee", employee);
        mv.setViewName("index.jsp");
        return mv;
    }
    // id=1&name=Ibrahim&tech=DotNet&laptop.id=1&laptop.name=HP&laptop.configuration=Corei7
    @RequestMapping("tocomplex")
    public ModelAndView toComplex(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("alien", alien);
        mv.setViewName("index.jsp");
        return mv;
    }
}
