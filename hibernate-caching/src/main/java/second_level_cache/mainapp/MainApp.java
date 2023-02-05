package second_level_cache.mainapp;

import config.HibernateConfig;
import first_level_cache.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = getSessionFactory();
        Session session1 = factory.openSession();
        Employee emp1 = session1.load(Employee.class, 121);
        System.out.println(emp1.getEId() + " " + emp1.getEName());
        session1.close();

        Session session2 = factory.openSession();
        Employee emp2 = session2.load(Employee.class, 121);
        System.out.println(emp2.getEId() + " " + emp2.getEName());
        session2.close();

    }

    public static SessionFactory getSessionFactory() {
        return HibernateConfig.getSessionFactory();
    }
}
