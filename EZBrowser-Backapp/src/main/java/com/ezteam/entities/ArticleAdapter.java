package com.ezteam.entities;

import org.springframework.stereotype.Component;

@Component
public class ArticleAdapter {

    public Article toArticle(final ArticleDTO articleDTO) {
        return articleDTO != null ?
                Article.builder()
                .id(articleDTO.getId())
                .title(articleDTO.getTitle())
                .author(articleDTO.getAuthor())
                .date(articleDTO.getDate())
                .keyword(articleDTO.getKeyword())
                .url(articleDTO.getUrl())
                .build()
            : null;
    }

    public ArticleDTO toArticleDto(final Article article) {
        return article != null ?
                ArticleDTO.builder()
                .id(article.getId())
                .title(article.getTitle())
                .author(article.getAuthor())
                .date(article.getDate())
                .keyword(article.getKeyword())
                .url(article.getUrl())
                .build()
            : null;
    }
}
