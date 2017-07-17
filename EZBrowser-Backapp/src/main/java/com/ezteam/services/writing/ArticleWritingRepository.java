package com.ezteam.services.writing;

import com.ezteam.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleWritingRepository extends JpaRepository<Article, Long> {
}
