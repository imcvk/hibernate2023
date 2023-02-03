package config;

import eager.Department;
import eager.Employee;
import lazy.Address;
import lazy.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateConfig {
    public static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        Properties p = new Properties();
        p.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
        p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        p.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        p.put(Environment.USER, "root");
        p.put(Environment.PASS, "root");
        p.put(Environment.SHOW_SQL, "true");
        p.put(Environment.HBM2DDL_AUTO, "update");
        p.put(Environment.FORMAT_SQL, "true");
        configuration.setProperties(p);
        configuration.addAnnotatedClass(Student.class).addAnnotatedClass(Address.class)
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(p).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
}
