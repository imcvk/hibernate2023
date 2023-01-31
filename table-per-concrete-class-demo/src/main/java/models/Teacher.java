package models;

import jakarta.persistence.Entity;

@Entity
public class Teacher extends Person {

  int teacherId;
  String teacherName;

  //getters and setters
  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }
}
