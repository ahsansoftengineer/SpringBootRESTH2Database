package com.springboot.dugesh.services;

import com.springboot.dugesh.dao.ChapterDao;
import com.springboot.dugesh.entities.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService implements IChapterService {

    @Autowired
    public ChapterDao chapterDao;

    @Override
    public List<Chapter> getChapters() {
        return chapterDao.findAll();
    }

    @Override
    public Chapter getChapter(int chapterId) {
        // This is not working for some Reason Fix it later
        // threw exception [Request processing failed; nested exception
        Chapter chapter = chapterDao.getById(chapterId);
        System.out.println(chapter);
        return chapter;
    }

    @Override
    public Chapter addChapter(Chapter chapter) {
        chapterDao.save(chapter);
        return chapter;
    }

    @Override
    public Chapter updateChapter(Chapter chapter) {
        chapterDao.save(chapter);
        return chapter;
    }

    @Override
    public ResponseEntity<HttpStatus> deleteChapter(int chapterId) {
        try{
            Chapter chapter =  chapterDao.getById(chapterId);
            System.out.println(chapter);
            chapterDao.delete(chapter);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
