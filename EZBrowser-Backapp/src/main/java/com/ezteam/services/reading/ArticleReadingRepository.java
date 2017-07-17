package com.ezteam.services.reading;

import com.ezteam.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleReadingRepository extends JpaRepository<Article, Long>{

    Optional<Article> findByKeyword(String keyword);
}
