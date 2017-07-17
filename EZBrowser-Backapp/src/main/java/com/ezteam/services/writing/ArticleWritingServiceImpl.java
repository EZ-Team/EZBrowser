package com.ezteam.services.writing;

import com.ezteam.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ArticleWritingServiceImpl implements ArticleWritingService {

    private final ArticleWritingRepository articleWritingRepository;

    @Autowired
    public ArticleWritingServiceImpl(ArticleWritingRepository articleWritingRepository){
        this.articleWritingRepository = articleWritingRepository;
    }

    @Override
    public void createArticle(Article article) {
        articleWritingRepository.save(article);
    }
}
