package com.ezteam.services.reading;

import com.ezteam.entities.ArticleAdapter;
import com.ezteam.entities.ArticleDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ArticleReadingServiceImpl implements ArticleReadingService{

    private final ArticleReadingRepository articleReadingRepository;
    private final ArticleAdapter articleAdapter;

    ArticleReadingServiceImpl(final ArticleReadingRepository articleReadingRepository,
                              final ArticleAdapter articleAdapter) {
        this.articleReadingRepository = articleReadingRepository;
        this.articleAdapter = articleAdapter;
    }

    @Override
    public List<ArticleDTO> search(String keyword) {
        return articleReadingRepository.findAllByKeyword(keyword)
                .stream()
                .map(articleAdapter::toArticleDto)
                .collect(Collectors.toList());
    }
}
