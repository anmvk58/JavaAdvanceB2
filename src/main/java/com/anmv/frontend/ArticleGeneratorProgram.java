package com.anmv.frontend;

import com.anmv.backend.ArticleGeneratorRepository;
import com.anmv.entity.ArticleGenerator;
import com.anmv.entity.Status;

public class ArticleGeneratorProgram {
    public static void main(String[] args) {
        ArticleGeneratorRepository articleGeneratorRepository = new ArticleGeneratorRepository();

        ArticleGenerator articleGenerator = new ArticleGenerator();
        articleGenerator.setTitle("Test Generator 5");
        articleGenerator.setStatus(Status.REJECT);

        articleGeneratorRepository.createArticleGenerator(articleGenerator);
    }
}
