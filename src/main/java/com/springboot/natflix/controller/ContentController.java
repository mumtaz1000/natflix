package com.springboot.natflix.controller;

import com.springboot.natflix.model.Content;
import com.springboot.natflix.service.ContentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content")
public class ContentController {

    private ContentService contentService;

    public ContentController(ContentService contentService){
        this.contentService = contentService;
    }

    @PostMapping()
    public ResponseEntity<Content> createContent(@RequestBody Content content){
        return new ResponseEntity<Content>(contentService.createContent(content), HttpStatus.CREATED);
    }
}
