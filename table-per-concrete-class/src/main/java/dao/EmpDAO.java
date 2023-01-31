package dao;

import config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmpDAO {
  private static SessionFactory sessionFactory = null;
  private static Session session = null;
  private static Transaction transaction = null;

  public static Session getSession() {
    sessionFactory = HibernateConfig.getSessionFactory();
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
