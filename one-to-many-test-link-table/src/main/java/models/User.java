package models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int userId;
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "acc_user")
  List<Account> accounts;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
}
