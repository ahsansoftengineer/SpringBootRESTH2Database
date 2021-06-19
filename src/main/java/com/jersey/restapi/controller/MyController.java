package com.jersey.restapi.controller;

import com.jersey.restapi.entities.Course;
import com.jersey.restapi.services.CourseService;
import com.jersey.restapi.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class MyController {
//    @Autowired(required = true)
    private CourseService courseService = new CourseService();

    @GetMapping("/home")
    public String home(){
        return "this home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PostMapping("/courses")
    public List<Course> addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return courseService.getCourse(Integer.parseInt(courseId));
    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable int courseId){
        return courseService.deleteCourse(courseId);
    }
}
