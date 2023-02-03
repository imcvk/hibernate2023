package mainapp;

import dao.EmployeeDAO;
import employeedata.EmployeeDataProvider;
import jakarta.persistence.*;
import model.Employee;

import java.util.List;

public class App {
  public static void main(String[] args) {
    EmployeeDataProvider edp = new EmployeeDataProvider();
    EmployeeDAO e = new EmployeeDAO();
    Employee employee = new Employee(edp.getFakeEmployeeNameFirst(), edp.getFakeEmployeeNameLast());
    e.saveEmployee(employee);
  }

    @Entity
    public static class Course {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      int id;
      String cname;
      @ManyToMany(mappedBy = "courses")
      List<Student> students;

      public int getId() {
        return id;
      }

      public void setId(int id) {
        this.id = id;
      }

      public String getCname() {
        return cname;
      }

      public void setCname(String cname) {
        this.cname = cname;
      }

      public List<Student> getStudents() {
        return students;
      }

      public void setStudents(List<Student> students) {
        this.students = students;
      }
    }

    @Entity
    public static class Student {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      int id;
      String sname;
      @ManyToMany(cascade = CascadeType.ALL, targetEntity = Course.class)
      List<Course> courses;

      public int getId() {
        return id;
      }

      public void setId(int id) {
        this.id = id;
      }

      public String getSname() {
        return sname;
      }

      public void setSname(String sname) {
        this.sname = sname;
      }

      public List<Course> getCourses() {
        return courses;
      }

      public void setCourses(List<Course> courses) {
        this.courses = courses;
      }
    }
}
