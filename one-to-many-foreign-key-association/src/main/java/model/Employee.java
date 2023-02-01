package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int empId;
  String empName;
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "empId")
  List<Address> addresses;

  public Employee() {
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}

