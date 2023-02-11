package mainapp;

import config.HibernateConfig;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import model.Employee;
import org.hibernate.Session;

import java.util.List;

public class CriteriaUtil {


    public void selectAll() { 
        Session session = HibernateConfig.getSessionFactory().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root);
        TypedQuery<Employee> query = session.createQuery(criteriaQuery);
        List<Employee> employees = query.getResultList();
        for (Employee e : employees)
            System.out.println(e);

    }
}
