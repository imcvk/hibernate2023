package NativeSQL_crud;

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

  public static String ALL_SELECTOR_NativeSQL = "select * FROM Employee";

  public List<Employee> get_all_employees_using_NativeSQL() {
    session = getSession();
    Query query = session.createNativeQuery(ALL_SELECTOR_NativeSQL, Employee.class);
    List<Employee> employees = query.getResultList();
    return employees;
  }

  String UNIQUE_SELECTOR_NativeSQL = "select * FROM Employee where eid=?";

  public Employee getUniqueEmployee(int id) {
    session = getSession();
    Query query = session.createNativeQuery(UNIQUE_SELECTOR_NativeSQL, Employee.class);
    query.setParameter(1, id);
    Employee e = (Employee) query.getSingleResult();
    return e;
  }

  //
  String DELETE_NativeSQL = "delete from Employee where eid=?";

  public int delete_using_NativeSQL(int id) {
    session = getSession();
    transaction = session.beginTransaction();
    Query query = session.createNativeQuery(DELETE_NativeSQL, Employee.class);
    query.setParameter(1, id);
    int i = query.executeUpdate();
    transaction.commit();
    session.close();
    return i;
  }

  String UPDATE_NativeSQL = "Update Employee e set e.ename=? where e.eid=?";

  public int update_employee_NativeSQL(Employee e) {
    session = getSession();
    transaction = session.beginTransaction();
    Query query = session.createNativeQuery(UPDATE_NativeSQL, Employee.class);
    query.setParameter(1, e.getEname());
    query.setParameter(2, e.getEid());
    int no_of_rows_updated = query.executeUpdate();
    transaction.commit();
    session.close();
    return no_of_rows_updated;
  }
}
