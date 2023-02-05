package mainapp;

import config.HibernateConfig;
import dummydata.DummyUserProvider;
import model.Department;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class NamedQueryDemo {
  public static void main(String[] args) {
    DummyUserProvider provider = new DummyUserProvider();
    Session session = getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
//    for(int i = 0; i < 20; i++) {
//      Department d = new Department();
//      d.setDName(provider.faker.job().field());
//      Employee employee = new Employee();
//      employee.setDepartment(d);
//      employee.setEName(provider.getFakeEmployeeNameFull());
//      session.persist(employee);
//
//    }
    transaction.commit();
    Query query = session.getNamedQuery("department.byId");
    query.setParameter("id", 102);
    Department department = (Department) query.getSingleResult();
    System.out.println(department);
  }

  public static SessionFactory getSessionFactory() {
    return HibernateConfig.getSessionFactory();
  }
}
