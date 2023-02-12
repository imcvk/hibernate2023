package dao;

import config.HibernateConfig;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ObjectDao {
  public static SessionFactory sessionFactory = null;
  public static Session session = null;
  List<User> users;
  public static Session getSession() {
    sessionFactory = HibernateConfig.getSessionFactory();
    session = sessionFactory.openSession();
    return session;
  }

  public void saveObject(Object o) {
    session = getSession();
    Transaction transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }

  public void updateDetails(Object o) {
    session = getSession();
    Transaction transaction = session.beginTransaction();
    session.saveOrUpdate(o);
    transaction.commit();
    session.close();
  }

  public void mergeUser(Object o) {
    session = getSession();
    Transaction transaction = session.beginTransaction();
    session.merge(o);
    transaction.commit();
    session.close();
  }

  public User getSingleUser(int userid) {
    session = getSession();
    User user;
    user = session.get(User.class, userid);
    return user;
  }

  public List<User> getUsers() {
    session = getSession();
    Query<User> query = session.createQuery("from User", User.class);
    users = query.getResultList();
    return users;
  }

  public void deleteUser(User user) {
    session = getSession();
    Transaction transaction = session.beginTransaction();
    session.remove(user);
    transaction.commit();
    session.close();
  }
}

