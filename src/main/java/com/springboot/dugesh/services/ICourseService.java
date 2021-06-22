package com.springboot.dugesh.services;

import com.springboot.dugesh.entities.Course;

import java.util.List;

// This is Required for Loose Coupling
public interface ICourseService {
    // Runtime polymorphism
    public List<Course> getCourses();
    public Course getCourse(int courseId);
    public List<Course> addCourse(Course course);
    public Course updateCourse(Course course);
    public String deleteCourse(int courseId);
}
