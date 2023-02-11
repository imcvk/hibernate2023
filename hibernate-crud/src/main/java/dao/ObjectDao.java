package dao;

import config.HibernateConfig;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ObjectDao {
    public static SessionFactory sessionFactory = null;

    public static Session getSession() {
        sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }

    public void saveObject(Object o) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(o);
        transaction.commit();
        session.close();
    }

    public void updateDetails(Object o) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(o);
        transaction.commit();
        session.close();
    }

    public User getSingleUser(int userid) {
        Session session = getSession();
        User user;
        user = session.get(User.class, userid);
        return user;
    }

    public List<User> getUsers() {
        Session session = getSession();
        Query<User> query = session.createQuery("from User", User.class);
        List<User> users = query.getResultList();
        return users;
    }

    public void deleteUser(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.remove(user);
        transaction.commit();
        session.close();
    }
}

