package com.springboot.natflix.service;

import com.springboot.natflix.model.Content;

import java.util.List;

public interface ContentService {

    Content createContent(Content content);

    List<Content> getAllContents();

    Content saveContent(Content content);

    Content getContentById(long id);

    Content updateContent(Content content, long id);

    void deleteContent(long id);
    List<Content> searchContent(String query);
}
