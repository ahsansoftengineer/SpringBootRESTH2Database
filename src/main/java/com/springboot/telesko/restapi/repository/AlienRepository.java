package com.springboot.telesko.restapi.repository;

import com.springboot.telesko.restapi.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien, Integer> { }
