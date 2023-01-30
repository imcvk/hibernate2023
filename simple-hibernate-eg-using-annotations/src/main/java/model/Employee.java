package model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int empid;
  String firstname;
  String lastname;

  public Employee() {
  }

  public Employee(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public Employee(int empid, String firstname, String lastname) {
    this.empid = empid;
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public int getEmpid() {
    return empid;
  }

  public void setEmpid(int empid) {
    this.empid = empid;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
}
