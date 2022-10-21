package com.springboot.natflix.service;

import com.springboot.natflix.model.Content;
import com.springboot.natflix.repository.ContentRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImplementation implements ContentService {

    private ContentRepository contentRepository;

    public ContentServiceImplementation(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Content createContent(Content content) {
        return contentRepository.save(content);
    }
}
