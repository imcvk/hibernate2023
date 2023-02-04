package hql_misc;

import config.HibernateConfig;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.List;

public class DAO {
  SessionFactory sessionFactory;
  Session session;
  Transaction transaction;

  public Session getSession() {
    sessionFactory = HibernateConfig.getSessionFactory();
    session = sessionFactory.openSession();
    return session;
  }

  public void saveObject(Object o) {
    session = getSession();
    transaction = session.beginTransaction();
    session.persist(o);
    transaction.commit();
    session.close();
  }

  String HQL_JOIN = "select q.questionId ,q.question,a.answerID,a.answer l̥ from Question q inner join Answer a ";

  public void hql_join() {
    session = getSession();
    Query hqlJoin = session.createQuery(HQL_JOIN);
    List<Object> objects = hqlJoin.getResultList();
    for(Object o : objects)
      System.out.println(Arrays.toString((Object[]) o));
  }
}
