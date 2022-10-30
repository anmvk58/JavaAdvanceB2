package com.anmv.backend;

import com.anmv.entity.ArticleGenerator;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;

public class ArticleGeneratorRepository {
    private HibernateUtils hibernateUtils;

    public ArticleGeneratorRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public void createArticleGenerator(ArticleGenerator articleGenerator){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            session.beginTransaction();
            session.save(articleGenerator);
            session.getTransaction().commit();

        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
