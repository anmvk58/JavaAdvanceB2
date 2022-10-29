package com.anmv.backend;

import com.anmv.entity.Book;
import com.anmv.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BookRepository {
    private HibernateUtils hibernateUtils;

    public BookRepository(){
        hibernateUtils = HibernateUtils.getInstance();
    }

    public List<Book> getListBook(){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            Query<Book> query = session.createQuery("FROM Book ");

            return query.list();

        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public void createBook(Book book){
        Session session = null;
        try{
            session = hibernateUtils.openSession();
            session.save(book);

        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
