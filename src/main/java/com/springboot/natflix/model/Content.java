package com.springboot.natflix.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "content")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title",
    nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private ContentCategory category ;

    @ManyToOne
    @JoinColumn(name="type_id", nullable=false)
    private ContentType type;

    @Column(name = "summary")
    private String summary;

    @Column(name = "logo_url")
    private String logoUrl;

    @Column(name = "banner_url")
    private String bannerUrl;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;
}
