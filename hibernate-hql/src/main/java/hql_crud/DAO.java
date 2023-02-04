package hql_crud;

import config.HibernateConfig;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class DAO {
  SessionFactory sessionFactory;
  Session session;
  Transaction transaction;

  public Session getSession() {
    sessionFactory = HibernateConfig.getSessionFactory();
    session = sessionFactory.openSession();
    return session;
  }

  public void saveObject(Object o) {
    session = getSession();
    transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }

  public static String ALL_SELECTOR_HQL = "FROM Employee";

  public List<Employee> get_all_employees_using_HQL() {
    session = getSession();
    Query query = session.createQuery(ALL_SELECTOR_HQL, Employee.class);
    List<Employee> employees = query.getResultList();
    return employees;
  }

  String UNIQUE_SELECTOR_HQL = "FROM Employee where eid=:x";

  public Employee getUniqueEmployee(int id) {
    session = getSession();
    Query query = session.createQuery(UNIQUE_SELECTOR_HQL, Employee.class);
    query.setParameter("x", id);
    return (Employee) query.getSingleResult();
  }
String DELETE_HQL="delete from Employee where eid=:empid";
  public int delete_using_hql(int id) {

    session = getSession();
    transaction = session.beginTransaction();
    Query query = session.createQuery(DELETE_HQL);
    query.setParameter("empid", id);
    int i = query.executeUpdate();
    transaction.commit();
    session.close();
    return i;
  }
}
