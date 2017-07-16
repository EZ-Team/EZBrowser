package com.ezteam;

import jdk.nashorn.internal.objects.annotations.Constructor;
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
@Table(name = "t_browser")
public class BrowserEntity {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Author")
    private String Author;

    @Column(name = "Date")
    private Date Date;

    @Column(name = "Keyword")
    private String Keyword;

    @Column(name = "Url")
    private String Url;
}
