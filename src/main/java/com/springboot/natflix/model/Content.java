package com.springboot.natflix.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title",
    nullable = false)
    private String title;

    /*
    @Column(name = "type_id")
    private String typeId;*/

    /*
    @Column(name = "category_id")
    private String categoryId;*/

    @Column(name = "summary")
    private String summary;

    @Column(name = "logo_url")
    private String logoUrl;

    @Column(name = "banner_url")
    private String bannerUrl;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;
}
