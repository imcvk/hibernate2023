package model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int empId;
  String empName;
  @OneToOne
  @JoinColumn(name = "addressId")
  Address address;

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

