package com.anmv.backend;

import com.anmv.entity.Order;
import com.anmv.entity.Order2;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;

public class Order2Repository {
    private HibernateUtils hibernateUtils;

    public Order2Repository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public void createOrder(Order2 order2){
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();
            session.save(order2);
            session.getTransaction().commit();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
