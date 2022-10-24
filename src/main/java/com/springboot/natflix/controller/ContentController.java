package com.springboot.natflix.controller;

import com.springboot.natflix.model.Content;
import com.springboot.natflix.service.ContentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/content")
@CrossOrigin(origins = "*")
public class ContentController {

    private ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping
    public List<Content> getAllContents() {
        return contentService.getAllContents();
    }


    @PostMapping()
    public ResponseEntity<Content> saveContent(@RequestBody Content content) {
        return new ResponseEntity<Content>(contentService.saveContent(content), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Content> getContentById(@PathVariable("id") long contentId) {
        return new ResponseEntity<Content>(contentService.getContentById(contentId), HttpStatus.OK);
    }

    //Build update employee REST API
    // http://localhost:8080/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<Content> updateContent(@PathVariable("id") long id,
                                                 @RequestBody Content content) {
        return new ResponseEntity<Content>(contentService.updateContent(content, id), HttpStatus.OK);
    }

    //Build delete employee REST API

    // http://localhost:8080/api/employees/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteContent(@PathVariable("id") long id) {

        //delete
        contentService.deleteContent(id);
        return new ResponseEntity<String>("Content deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Content>> searchContent(@RequestParam("query") String query) {
        return ResponseEntity.ok(contentService.searchContent(query));
    }
}
