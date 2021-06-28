package com.springboot.springdatarest.repository;

import com.springboot.springdatarest.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Dependencies for {["Spring Data Rest"]}
// H2, JPA, Rest Repository
@RepositoryRestResource(collectionResourceRel="departments", path="departments")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
// What is Hateoas?
// In the Response it is also providing links to modified a specific Record for every item in the collection

// For CRUD operations you need to provide the data in below format
//{
//    "id":1,
//    "name":"HR",
//    "job":"Enrollment",
//    "_links": {
//        "self": {
//              "href":"http://localhost:8080/departments/1"
//        },
//        "alien": {
//              "href":"http://localhost:8080/departments/1"
//        }
//    }
//}