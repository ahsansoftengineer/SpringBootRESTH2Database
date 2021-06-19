package com.jersey.restapi.services;

import com.jersey.restapi.entities.Course;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService implements ICourseService {

    public List<Course> courses = new ArrayList<>();

    public CourseService() {
        courses.add(new Course(1, "Java", "Interpreter and Compiled Language"));
        courses.add(new Course(2, "C#", "Interpreter and Compiled Language"));
        courses.add(new Course(3, "Python", "Interpreter and Compiled Language"));
        courses.add(new Course(4, "JavaScript", "Scripting Language"));
    }

    @Override
    public List<Course> getCourses() {
            return courses;
    }

    @Override
    public Course getCourse(int courseId) {
        for(Course c: courses){
            if(c.getId() == courseId){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Course> addCourse(Course course) {
        this.courses.add(course);
        return courses;
    }

    @Override
    public Course updateCourse(Course course) {
        for(Course c: courses){
            if(c.getId() == course.getId()){
                c.setName(course.getName());
                c.setDescription(course.getDescription());
                return c;
            }
        }
        course.setName("No Data Found with given Id");
        course.setDescription("Nothing Modified");
        return course;
    }

    @Override
    public String deleteCourse(int courseId) {
        int totalcourse = courses.size();
        courses = courses.stream().filter(c -> c.getId() != courseId).collect(Collectors.toList());
        if(totalcourse == courses.size())
            return "No Course Found to Delete";
        else
            return "Delete Course with id : " + courseId;
    }
}
