package com.anmv.backend;

import com.anmv.entity.CustomId;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class CustomIdGeneratorRepository {
    private HibernateUtils hibernateUtils;

    public CustomIdGeneratorRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public void createCustomId(CustomId customId){
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();
            session.save(customId);
            session.getTransaction().commit();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public int getCountByType(String type){
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            Query<Long> query = session.createQuery("SELECT COUNT(*) FROM CustomId WHERE type = :typeParameter");

            query.setParameter("typeParameter", type);

            return query.uniqueResult().intValue();

        } finally {
            if(session != null){
                session.close();
            }
        }

    }
}
