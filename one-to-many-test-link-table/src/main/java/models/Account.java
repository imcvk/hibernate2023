package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int accId;
  String accNumber;

  public int getAccId() {
    return accId;
  }

  public void setAccId(int accId) {
    this.accId = accId;
  }

  public String getAccNumber() {
    return accNumber;
  }

  public void setAccNumber(String accNumber) {
    this.accNumber = accNumber;
  }
}
