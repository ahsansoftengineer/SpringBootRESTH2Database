package com.jersey.restapi.services;

import com.jersey.restapi.entities.Chapter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IChapterService {
    // Runtime polymorphism
    public List<Chapter> getChapters();
    public Chapter getChapter(int chapterId);
    public Chapter addChapter(Chapter chapter);
    public Chapter updateChapter(Chapter chapter);
    public ResponseEntity<HttpStatus> deleteChapter(int chapterId);
}
