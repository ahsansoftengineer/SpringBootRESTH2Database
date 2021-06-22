package com.springboot.dugesh.dao;

import com.springboot.dugesh.entities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChapterDao extends JpaRepository<Chapter, Integer> {

}