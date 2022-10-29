package com.anmv.frontend;

import com.anmv.backend.NewsRepository;
import com.anmv.entity.News;
import com.anmv.entity.Status;

import java.util.List;

public class NewsProgram {
    public static void main(String[] args) {
        NewsRepository newsRepository = new NewsRepository();

        News news = new News();
        news.setTitle("News 04");
        news.setStatus(Status.REJECT);

//        newsRepository.createNews(news);

        List<News> newsList = newsRepository.getListNews();
        for (News n : newsList
        ) {
            System.out.println(n);
        }
    }

}
