package com.ezteam;

import com.ezteam.entities.ArticleAdapter;
import com.ezteam.entities.ArticleDTO;
import com.ezteam.exception.CreationFailedException;
import com.ezteam.services.writing.ArticleWritingService;
import com.ezteam.services.reading.ArticleReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/search")
public class ArticleController {

    private final ArticleWritingService articleWritingService;
    private final ArticleReadingService articleReadingService;
    private final ArticleAdapter articleAdapter;

    @Autowired
    public ArticleController(ArticleWritingService articleWritingService, ArticleReadingService articleReadingService){
        this.articleWritingService = articleWritingService;
        this.articleReadingService = articleReadingService;
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

    @GetMapping("{keyword}")
    public List<ArticleDTO> getArticlesByKeyword(@PathVariable final String keyword) {
        return articleReadingService.search(keyword);
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
