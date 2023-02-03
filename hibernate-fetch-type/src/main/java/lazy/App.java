package lazy;

import dao.ObjectDAO;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
      Student s1 = new Student();
      Course c1, c2;
      c1 = new Course();
      c2 = new Course();
      c1.setCname("java");
      c2.setCname("Python");
      s1.setSname("Pravin");

      c1.setStudents(List.of(new Student[]{s1}));
      c2.setStudents(List.of(new Student[]{s1}));
      ArrayList<Course> courses = new ArrayList<>();
      courses.addAll(List.of(new Course[]{c1, c2}));
      s1.setCourses(courses);
      ObjectDAO.saveObject(s1);
      System.out.println("success");
    }
}
