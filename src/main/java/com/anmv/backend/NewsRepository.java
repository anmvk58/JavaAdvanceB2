package com.anmv.backend;

import com.anmv.entity.Article;
import com.anmv.entity.News;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class NewsRepository {
    private HibernateUtils hibernateUtils;

    public NewsRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public List<News> getListNews(){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            Query<News> query = session.createQuery("FROM News ");

            return query.list();

        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public void createNews(News news){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            session.save(news);

        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
