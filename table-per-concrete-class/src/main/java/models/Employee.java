package models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int empId;
  String empName;

  public Employee() {
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getName() {
    return empName;
  }

  public void setName(String name) {
    this.empName = name;
  }
}
