package com.jersey.restapi.controller;

import com.jersey.restapi.entities.Chapter;
import com.jersey.restapi.services.IChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChapterController {

    @Autowired()
    public IChapterService chapterService;


    @GetMapping("/chapter")
    public String home(){
        return "this chapter home page";
    }

    @GetMapping("/chapters")
    public List<Chapter> getChapters(){
        return chapterService.getChapters();
    }

    @PostMapping("/chapters")
    public Chapter addChapter(@RequestBody Chapter chapter){
        System.out.println("Chapter is calling");
        return chapterService.addChapter(chapter);
    }

    @GetMapping("/chapters/{chapterId}")
    public Chapter getChapter(@PathVariable int chapterId){
        return chapterService.getChapter(chapterId);
    }

    @PutMapping("/chapters")
    public Chapter updateChapter(@RequestBody Chapter chapter){
        return chapterService.updateChapter(chapter);
    }

    @DeleteMapping("/chapters/{chapterId}")
    public ResponseEntity<HttpStatus> deleteChapter(@PathVariable int chapterId){
        return  chapterService.deleteChapter(chapterId);
    }
}
