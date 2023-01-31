package mainapp;

import dao.ObjectDAO;
import models.Person;
import models.Student;
import models.Teacher;

public class MainApp {
  public static void main(String[] args) {
    Person p = new Person();
    p.setPname("Salamanca");

    Student s = new Student();
    s.setPname("Lalo");
    s.setStudentName("Eduardo Salamanca");

    Teacher t = new Teacher();
    t.setPname("Hector");
    t.setTeacherName("Hector Salamanca");

    ObjectDAO.saveObject(p);
    ObjectDAO.saveObject(s);
    ObjectDAO.saveObject(t);
  }
}
