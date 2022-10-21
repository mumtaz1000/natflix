package com.springboot.natflix.repository;

import com.springboot.natflix.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
