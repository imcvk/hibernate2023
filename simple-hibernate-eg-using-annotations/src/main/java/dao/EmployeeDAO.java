package dao;

import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

  public static Session session = null;
  public static Transaction transaction = null;

  public SessionFactory getSessionFactory() {
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    return sessionFactory;
  }

  public void saveEmployee(Employee e) {
    session = getSessionFactory().openSession();
    transaction = session.beginTransaction();
    session.persist(e);
    transaction.commit();
    session.close();
  }
}
