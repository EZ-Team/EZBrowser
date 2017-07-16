package com.ezteam.controller;

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

        private Long Id;

        private String Title;

        private String Author;

        private Date Date;

        private String Keyword;

        private String Url;
}
