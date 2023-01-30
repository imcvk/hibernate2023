package dao;

import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

  public static Transaction transaction = null;
  public static Session session = null;

  public static Session getSessionFactory() {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    session = sessionFactory.openSession();
    return session;
  }

  public static void saveEmployee(Employee e) {
    session = getSessionFactory();
    transaction = session.beginTransaction();
    session.persist(e);
    transaction.commit();
    session.close();
  }
}
