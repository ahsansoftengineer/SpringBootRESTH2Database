package com.springboot.telesko.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller()
@RequestMapping("servlet")
public class ServletController {
    // Same Page is being using for Different Request
    // Taking Data from QueryParameter by using HttpServletRequest
    @RequestMapping("index")
    public String index(HttpServletRequest request){
        // In Request Dispatcher two Servlet (1 JSP and 1 Servlet) share same Request Object
        String name = request.getParameter("name");
        // Sending data using setAttribute
        // request.setAttribute("name", name);

        // Sending data using HttpSession
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        System.out.println(name);
        return "index.jsp";
    }
}
