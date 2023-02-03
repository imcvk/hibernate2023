package lazy;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
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
