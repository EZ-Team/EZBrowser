package com.ezteam.services.reading;

import com.ezteam.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface ArticleReadingRepository extends JpaRepository<Article, Long>{

    List<Article> findAllByKeyword(String keyword);
}
