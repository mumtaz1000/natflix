package com.springboot.natflix.repository;

import com.springboot.natflix.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {

    @Query("SELECT c FROM Content c WHERE " +
            "c.title LIKE CONCAT('%',:query, '%')" +
            "Or c.summary LIKE CONCAT('%', :query, '%')")
    List<Content> searchContents(String query);
}


