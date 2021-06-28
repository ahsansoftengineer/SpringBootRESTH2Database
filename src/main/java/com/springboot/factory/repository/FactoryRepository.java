package com.springboot.factory.repository;

import com.springboot.factory.model.Factory;
import org.springframework.data.repository.CrudRepository;

public interface FactoryRepository extends CrudRepository<Factory, Integer> {
}
