package models;

import jakarta.persistence.Entity;

@Entity
public class Student extends Person {

  int studentId;
  String studentName;

  //getters and setters
  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }
}
