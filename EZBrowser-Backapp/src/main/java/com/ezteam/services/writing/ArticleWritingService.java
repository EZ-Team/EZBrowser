package com.ezteam.services.writing;

import com.ezteam.entities.Article;

public interface ArticleWritingService {

    void createArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(Long id);
}
