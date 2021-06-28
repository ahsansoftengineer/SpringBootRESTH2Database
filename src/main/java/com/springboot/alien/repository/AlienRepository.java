package com.springboot.alien.repository;

import com.springboot.alien.model.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
// What is the difference between JpaRepository and CrudRepository
// JpaRepository Extends CrudRepository

// What are the ways of Connecting to database in JAVA?
// 1. JDBC, (Hibernate, iBatis...), JPA

// Creating Interface and Extending it with CrudRepository is JPA Concept
public interface AlienRepository extends CrudRepository<Alien, Integer> {
    // Alien findById(Integer id); is Already Defined

    // To Create such method follow some protocol
    // Method should start with (findBy / getBy)
    // Method should prefix with (Property Name)
    List<Alien> findByName(String name);
    List<Alien> findByGender(String gender);

    // Some Other useful method
    List<Alien> findByIdGreaterThan(Integer id);

    // Creating own SQL Query
    @Query("FROM Alien WHERE gender=?1 order by name")
    List<Alien> findByGenderSorted(String gender);
}
