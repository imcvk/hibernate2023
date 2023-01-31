package dao;

import config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ObjectDAO {
  public static SessionFactory sessionFactory = null;
  public static Session session = null;
  public static Transaction transaction = null;

  public static SessionFactory getSessionFactory() {
    sessionFactory = HibernateConfig.getSessionFactory();
    return sessionFactory;
  }

  public static Session getSession() {
    sessionFactory=getSessionFactory();
    session = sessionFactory.openSession();
    return session;
  }

  public static void saveObject(Object o) {
    session = getSession();
    transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }
}
