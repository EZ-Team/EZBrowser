package com.ezteam.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Teddy on 16/07/2017.
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "t_article")
public class Article {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "date")
    private Date date;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "url")
    private String url;
}
