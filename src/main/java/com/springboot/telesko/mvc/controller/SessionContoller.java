package com.springboot.telesko.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("session")
public class SessionContoller {
    // It is Easier then using Servlet
    @RequestMapping("index")
    public String index(String name, HttpSession session){
        session.setAttribute("name", name);
        return "index.jsp";
    }
    // Request Param is required when your field name different then URL Query Parameter
    @RequestMapping("home")
    public String home(@RequestParam("name") String myName, HttpSession session){
        session.setAttribute("name", myName);
        return "index.jsp";
    }
}
