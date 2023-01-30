package dao;

import config.HibernateConfig;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {
  public SessionFactory sessionFactory = null;
  public Transaction transaction = null;

  public Session getSession() {
    return HibernateConfig.getSessionFactory().openSession();
  }

  public void saveEmployee(Employee e) {
    Session session = getSession();
    transaction = session.beginTransaction();
    session.persist(e);
    transaction.commit();
    session.close();
  }
}
