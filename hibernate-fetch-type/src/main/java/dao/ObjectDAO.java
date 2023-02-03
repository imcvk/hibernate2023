package dao;

import config.HibernateConfig;
import eager.Employee;
import lazy.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ObjectDAO {
    public static SessionFactory sessionFactory = null;
    public static Transaction transaction = null;

    public static SessionFactory getSessionFactory() {
        sessionFactory = HibernateConfig.getSessionFactory();
        return sessionFactory;
    }

    public static void saveObject(Object o) {
        Session session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.persist(o);
        transaction.commit();
        session.close();
    }

    public static Student getStudent(int id) {
        Session session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Student s = session.get(Student.class, id);
        session.close();
        return s;
    }

    public static Employee getEmployee(int id) {
        Session session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Employee e = session.get(Employee.class, id);
        session.close();
        return e;
    }
}
