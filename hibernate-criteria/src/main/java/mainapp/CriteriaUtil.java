package mainapp;

import config.HibernateConfig;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import model.Department;
import model.Employee;
import org.hibernate.Session;

import java.util.List;

public class CriteriaUtil {
  public static Session session;
  public static CriteriaBuilder cb;
  public static CriteriaQuery<Employee> criteriaQuery;
  public static Root<Employee> root;

  CriteriaUtil() {
    session = HibernateConfig.getSessionFactory().openSession();
    cb = session.getCriteriaBuilder();
    criteriaQuery = cb.createQuery(Employee.class);
    root = criteriaQuery.from(Employee.class);
  }

  /**
   * criteria using equals
   */
  public void where_criteria_demo() {
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("criteria using equals");
    criteriaQuery.select(root);
    criteriaQuery.where(cb.equal(root.get("eName"), "Schiller,Toney"));
    TypedQuery<Employee> query = session.createQuery(criteriaQuery);
    List<Employee> employees = query.getResultList();
    for(Employee e : employees)
      System.out.println(e);

    System.out.println("-------------------------------------------------------------------------------------------------");
  }

  //Querying for entities:

  public void fetch_all_records_using_criteria() {
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Querying for entities:");
    CriteriaBuilder cb = session.getCriteriaBuilder();
    CriteriaQuery<Employee> criteriaQuery = cb.createQuery(Employee.class);
    Root<Employee> employee = criteriaQuery.from(Employee.class);
    criteriaQuery.select(employee);
    TypedQuery<Employee> query = session.createQuery(criteriaQuery);
    List<Employee> employees = query.getResultList();
    for(Employee e : employees)
      System.out.println(e);
    System.out.println("-------------------------------------------------------------------------------------------------");
  }

  //Adding conditions

  public void fetch_records_using_criteria_with_condition() {
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Adding conditions");
    criteriaQuery.where(cb.gt(root.get("eSalary"), 348493));
    criteriaQuery.where(cb.lt(root.get("eSalary"), 500000));
    TypedQuery<Employee> query = session.createQuery(criteriaQuery);
    List<Employee> employees = query.getResultList();
    for(Employee e : employees)
      System.out.println(e);
    System.out.println("-------------------------------------------------------------------------------------------------");
  }

  //Ordering results:

  public void fetching_records_in_order_with_condition() {
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Ordering results:");
    criteriaQuery.select(root);
    criteriaQuery.orderBy(cb.asc(root.get("eSalary")));
    TypedQuery<Employee> query = session.createQuery(criteriaQuery);
    List<Employee> employees = query.getResultList();
    for(Employee e : employees)
      System.out.println(e);
    System.out.println("-------------------------------------------------------------------------------------------------");
  }
  //Joining tables:

  public void joining_tables_using_criteria() {
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Joining tables:");
    CriteriaBuilder cb = session.getCriteriaBuilder();
    CriteriaQuery<Object[]> criteriaQuery = cb.createQuery(Object[].class);
    Root<Employee> employee = criteriaQuery.from(Employee.class);
    Join<Employee, Department> department = employee.join("department");
    criteriaQuery.multiselect(employee, department);
    TypedQuery<Object[]> query = session.createQuery(criteriaQuery);
    List<Object[]> resultList = query.getResultList();
    for(Object[] e : resultList) {
      for(Object o : e) {
        System.out.println(o);
      }
    }
    System.out.println("-------------------------------------------------------------------------------------------------");
  }
}
