package object_dao;

import config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Object_DAO {
  public static SessionFactory sessionFactory = null;
  public static Transaction transaction = null;

  public static Session getSession() {
    sessionFactory = HibernateConfig.getSessionFactory();
    return sessionFactory.openSession();
  }

  public static void saveObject(Object o) {
    Session session = getSession();
    transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }
}
