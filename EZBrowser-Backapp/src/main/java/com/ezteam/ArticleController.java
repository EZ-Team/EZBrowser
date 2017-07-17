package com.ezteam;

import com.ezteam.entities.Article;
import com.ezteam.entities.ArticleAdapter;
import com.ezteam.entities.ArticleDTO;
import com.ezteam.exception.CreationFailedException;
import com.ezteam.services.writing.ArticleWritingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class ArticleController {

    private final ArticleWritingService articleWritingService;
    private final ArticleAdapter articleAdapter;

    @Autowired
    public ArticleController(ArticleWritingService articleWritingService){
        this.articleWritingService = articleWritingService;
        this.articleAdapter = new ArticleAdapter();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createArticle(@RequestBody @Valid ArticleDTO articleDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new CreationFailedException();
        }

        try {
            articleWritingService.createArticle(articleAdapter.toArticle(articleDTO));
        } catch (Exception e) {
            throw new CreationFailedException();
        }
    }

    @PutMapping
    public void updateArticle(@RequestBody @Valid ArticleDTO articleDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new CreationFailedException();
        }

        try {
            articleWritingService.updateArticle(articleAdapter.toArticle(articleDTO));
        } catch (Exception e) {
            throw new CreationFailedException();
        }
    }

    @DeleteMapping
    public void deleteArticle(Long id){
        articleWritingService.deleteArticle(id);
    }
}
