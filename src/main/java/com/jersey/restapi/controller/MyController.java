package com.jersey.restapi.controller;

import com.jersey.restapi.entities.Course;
import com.jersey.restapi.services.CourseService;
import com.jersey.restapi.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class MyController {

    @Autowired()
    private ICourseService courseService = new CourseService();


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
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int courseId){
        try {
            if(courseService.deleteCourse(courseId) == "No Course Found to Delete"){
                throw new Exception("Resource not fond");
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
