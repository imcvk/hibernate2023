package embedding_object;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student();
        Certificate certificate = new Certificate();
        certificate.setCname("Java");
        student.setName("Ramesh");
        student.setCertificate(certificate);
        save(student);
    }

    public static void save(Object o) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(o);
        transaction.commit();
        session.close();
    }
}
