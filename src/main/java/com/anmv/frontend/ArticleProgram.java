package com.anmv.frontend;

import com.anmv.backend.ArticleRepository;
import com.anmv.entity.Article;
import com.anmv.entity.Status;

import java.util.List;

public class ArticleProgram {
    public static void main(String[] args) {
        ArticleRepository articleRepository = new ArticleRepository();

        Article article = new Article();
        article.setTitle("Number 05");
        article.setStatus(Status.REVIEW);

//        articleRepository.createAricle(article);

        List<Article> articles = articleRepository.getListArticle();
        for (Article a : articles) {
            System.out.println(a);

        }
    }
}
