package com.springboot.natflix.service;

import com.springboot.natflix.exception.ResourceNotFoundException;
import com.springboot.natflix.model.Content;
import com.springboot.natflix.repository.ContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentServiceImplementation implements ContentService {

    private ContentRepository contentRepository;

    public ContentServiceImplementation(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }


    @Override
    public Content createContent(Content content) {
        return null;
    }

    @Override
    public List<Content> getAllContents() {
        return contentRepository.findAll();
    }

    @Override
    public Content saveContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public Content getContentById(long id) {
        Optional<Content> content = contentRepository.findById(id);
        return contentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Content","Id",id));
    }

    @Override
    public Content updateContent(Content content, long id) {
        Content existingContent = contentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Content","Id",id));
        return null;
    }

    @Override
    public void deleteContent(long id) {
        Content existingContent = contentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Content","Id",id));
        contentRepository.deleteById(id);
    }

    @Override
    public List<Content> searchContent(String query) {
        List<Content> contents = contentRepository.searchContents(query);
        return contents;
    }


}
