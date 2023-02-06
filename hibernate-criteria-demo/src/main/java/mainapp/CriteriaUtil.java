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
public void selectAll(){
    criteriaQuery.select(root);
    criteriaQuery.ge
}
}
