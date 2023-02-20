package dao;

import config.HibernateUtil;
import jakarta.persistence.Query;
import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ObjectDao {
  public static SessionFactory sessionFactory = null;

  public Session getSession() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    return session;
  }

  public void saveObject(Object o) {
    Session session = getSession();
    Transaction transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }

  public void delete(Object o) {
    Session session = getSession();
    Transaction transaction = session.beginTransaction();
    session.remove(o);
    transaction.commit();
    session.close();
  }

  public void update(Object o) {
    Session session = getSession();
    Transaction transaction = session.beginTransaction();
    session.merge(o);
    transaction.commit();
    session.close();
  }

  public User selectUnique(int id) {
    Session session = getSession();
    User user = session.get(User.class, id);
    return user;
  }

  String user_list = "from User u";

  public List<User> selectUserList() {
    Session session = getSession();
    Query query = session.createQuery(user_list, User.class);
    List<User> users = query.getResultList();
    return users;
  }
}
