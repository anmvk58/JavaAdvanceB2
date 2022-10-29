package com.anmv.backend;

import com.anmv.entity.Article;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ArticleRepository {
    private HibernateUtils hibernateUtils;

    public ArticleRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public List<Article> getListArticle(){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            Query<Article> query = session.createQuery("FROM Article ");

            return query.list();

        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public void createAricle(Article article){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            session.save(article);

        } finally {
            if(session != null){
                session.close();
            }
        }
    }

}
