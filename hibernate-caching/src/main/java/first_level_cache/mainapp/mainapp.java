package first_level_cache.mainapp;

import config.HibernateConfig;
import dummydata.DummyUserProvider;
import first_level_cache.model.Department;
import first_level_cache.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mainapp {
    public static void main(String[] args) {
        Session session = getSessionFactory().openSession();
        DummyUserProvider provider = new DummyUserProvider();
        Employee e = new Employee();
        Department d = new Department();
        d.setDName(provider.faker.job().field());
        e.setEName(provider.getFakeEmployeeNameFull());
        e.setDepartment(d);
        session.persist(e);
        Employee employee = session.get(Employee.class, 2);
        System.out.println(employee);
        System.out.println("Checking for first level cache");
        employee = session.get(Employee.class, 2);
        System.out.println(employee);
    }

    public static SessionFactory getSessionFactory() {
        return HibernateConfig.getSessionFactory();
    }
}
