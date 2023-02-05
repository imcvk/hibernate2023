package mainapp;

import config.HibernateConfig;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class NamedQueryGroupingDemo {
  public static void main(String[] args) {
    Session session = getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    /**
     * Fetching single Employee record using named query
     * */
    Employee employee = (Employee) session.getNamedQuery("fetchSingleEmployeeById")
        .setParameter("eid", 152).getSingleResult();
    System.out.println(employee);
    /**
     * Fetching List of Employee record using named query
     * */
    List employees = session.getNamedQuery("fetchAllEmployees").getResultList();
    for(Object e : employees)
      System.out.println(e);
    /**
     * Delete employee using named query
     * */

    if(session.getNamedQuery("deleteEmployeeUsingId").setParameter("eid", 152)
        .executeUpdate() == 1) {
      System.out.println("Provided Employee deleted");
    } else {
      System.out.println("Employee not found");
    }
    transaction.commit();
    session.close();
  }

  public static SessionFactory getSessionFactory() {
    return HibernateConfig.getSessionFactory();
  }
}
