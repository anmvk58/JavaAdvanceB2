package com.anmv.backend;

import com.anmv.entity.ArticleUuidGenerator;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;

public class ArticleUuidGereratorRepository {
    private HibernateUtils hibernateUtils;

    public ArticleUuidGereratorRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public void createArticleUuidGenerator(ArticleUuidGenerator articleUuidGenerator){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            session.beginTransaction();
            session.save(articleUuidGenerator);
            session.getTransaction().commit();

        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
