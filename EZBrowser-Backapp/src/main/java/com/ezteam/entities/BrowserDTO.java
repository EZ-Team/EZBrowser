package com.ezteam.entities;

import lombok.*;

import java.util.Date;

/**
 * Created by Teddy on 16/07/2017.
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class BrowserDTO {

        private Long id;

        private String title;

        private String author;

        private Date date;

        private String keyword;

        private String url;
}
