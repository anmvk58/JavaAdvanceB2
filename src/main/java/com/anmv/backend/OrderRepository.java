package com.anmv.backend;

import com.anmv.entity.Order;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;

public class OrderRepository {
    private HibernateUtils hibernateUtils;

    public OrderRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    public void createOrder(Order order){
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
