package model;

import jakarta.persistence.*;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int empId;
  String empName;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinTable(name = "emp_address")
  Address address;
//getters and setters
  public Employee() {
  }

  public Employee(String empName, Address address) {
    this.empName = empName;
    this.address = address;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Employee(int empId, String empName, Address address) {
    this.empId = empId;
    this.empName = empName;
    this.address = address;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}

