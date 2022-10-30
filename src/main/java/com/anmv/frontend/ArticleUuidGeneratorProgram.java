package com.anmv.frontend;

import com.anmv.backend.ArticleUuidGereratorRepository;
import com.anmv.entity.ArticleUuidGenerator;
import com.anmv.entity.Status;

public class ArticleUuidGeneratorProgram {
    public static void main(String[] args) {
        ArticleUuidGereratorRepository articleUuidGereratorRepository = new ArticleUuidGereratorRepository();

        ArticleUuidGenerator articleUuidGenerator = new ArticleUuidGenerator();
        articleUuidGenerator.setTitle("UUID 1");
        articleUuidGenerator.setStatus(Status.OPEN);

        articleUuidGereratorRepository.createArticleUuidGenerator(articleUuidGenerator);
        System.out.println("Create complete");

    }
}
