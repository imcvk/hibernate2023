package model;

import jakarta.persistence.*;

@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int addressId;
  String empAddress;
  @OneToOne(mappedBy = "address")
  Employee employee;

  public Address() {
  }

  public Address(String empAddress, Employee employee) {
    this.empAddress = empAddress;
    this.employee = employee;
  }

  public Address(int addressId, String empAddress, Employee employee) {
    this.addressId = addressId;
    this.empAddress = empAddress;
    this.employee = employee;
  }

  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }

  public String getEmpAddress() {
    return empAddress;
  }

  public void setEmpAddress(String empAddress) {
    this.empAddress = empAddress;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
