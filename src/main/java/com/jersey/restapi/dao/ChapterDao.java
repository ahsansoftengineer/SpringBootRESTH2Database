package com.jersey.restapi.dao;

import com.jersey.restapi.entities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChapterDao extends JpaRepository<Chapter, Integer> {

}