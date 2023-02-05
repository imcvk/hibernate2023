package config;

import model.Department;
import model.Employee;
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
       // p.put(Environment.USE_SECOND_LEVEL_CACHE, true);
        //p.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");
        configuration.setProperties(p);
        configuration.addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                .addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(p).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
}
