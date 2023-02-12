package dao;

import config.HibernateConfig;
import model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ObjectDao {
  public static SessionFactory sessionFactory = null;
  public static Session session = null;
  List<UserDetails> users;
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

  public UserDetails getSingleUser(int userid) {
    session = getSession();
    UserDetails user;
    user = session.get(UserDetails.class, userid);
    return user;
  }

  public List<UserDetails> getUsers() {
    session = getSession();
    Query<UserDetails> query = session.createQuery("from UserDetails", UserDetails.class);
    users = query.getResultList();
    return users;
  }

  public void deleteUser(UserDetails user) {
    session = getSession();
    Transaction transaction = session.beginTransaction();
    session.remove(user);
    transaction.commit();
    session.close();
  }
}

