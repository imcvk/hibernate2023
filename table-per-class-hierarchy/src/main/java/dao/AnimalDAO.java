package dao;

import config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AnimalDAO {
  public static SessionFactory sessionFactory = null;
  public static Transaction transaction = null;

  public static SessionFactory getSessionFactory() {
    sessionFactory = HibernateConfig.getSessionFactory();
    return sessionFactory;
  }

  public static void saveObject(Object o) {
    Session session = getSessionFactory().openSession();
    transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }
}
