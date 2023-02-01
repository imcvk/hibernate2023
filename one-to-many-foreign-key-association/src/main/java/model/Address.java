package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int addressId;
  String empAddress;

  public Address() {
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

}
