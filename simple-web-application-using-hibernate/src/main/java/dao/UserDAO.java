package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {
  public static SessionFactory sessionFactory = null;
  public static Session session = null;
  public static Configuration configuration = null;
  public static Transaction transaction = null;

  public UserDAO() {

  }

  public static Session getSession() {
    configuration = new Configuration().configure("hibernate.cfg.xml");
    sessionFactory = configuration.buildSessionFactory();
    session = sessionFactory.openSession();
    return session;
  }

  public void saveUser(User u) {
    session = getSession();
    transaction = session.beginTransaction();
    session.persist(u);
    transaction.commit();
  }
}
