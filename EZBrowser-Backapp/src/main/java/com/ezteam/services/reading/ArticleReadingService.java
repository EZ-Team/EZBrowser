package com.ezteam.services.reading;

import com.ezteam.entities.ArticleDTO;

import java.util.List;

public interface ArticleReadingService {

    List<ArticleDTO> search(String keyword);
}
