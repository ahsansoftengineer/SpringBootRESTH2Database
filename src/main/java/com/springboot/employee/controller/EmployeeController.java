package com.springboot.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.employee.model.Employee;
import com.springboot.employee.repository.EmployeeRepository;

// This example for Simple Controller
@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("form")
    public ModelAndView form(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("employee/employeeform.jsp");
        return mv;
    }

    // To Force JSON / XML Format undermentioned dependency is required
    // jackson-dataformat-xml in POM File
    @RequestMapping(path = "/result", produces = {"application/json"})
    public ModelAndView addEmployee(Employee employee){
        employeeRepository.save(employee);
        ModelAndView mv = new ModelAndView();
        mv.addObject("employee", employee);
        mv.setViewName("employee/employee.jsp");
        return mv;
    }

    // Jackson library is responsible to convert Normal Object into JSON FORMAT
    @RequestMapping("employees")
    @ResponseBody
    public Iterable<Employee> employees(){
        return employeeRepository.findAll();
    }

    @RequestMapping("employees/{id}")
    @ResponseBody
    public Optional<Employee> employees(@PathVariable int id){
        return employeeRepository.findById(id);
    }
    // For Add and Update
    @RequestMapping(path = "employees", method = {RequestMethod.POST, RequestMethod.PUT})
    @ResponseBody
    public Employee employeesAdd(@RequestBody Employee employee){
        System.out.println("Update /  Add");
        employeeRepository.save(employee);
        return employee;
    }

    @RequestMapping(path = "employees", method = RequestMethod.DELETE)
    @ResponseBody
    public String employeesDelete(@RequestBody Employee employee){
        employeeRepository.delete(employee);
        return "Employee Deleted";
    }


}
