package mainapp;

import dao.ObjectDAO;
import employeedata.EmployeeDataProvider;
import models.Account;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    EmployeeDataProvider dataProvider = new EmployeeDataProvider();
    Account a1, a2, a3;
    a1 = new Account();
    a1.setAccNumber(String.valueOf(dataProvider.faker.number().numberBetween(11111, 9999)));
    a2 = new Account();
    a2.setAccNumber(String.valueOf(dataProvider.faker.number().numberBetween(11111, 9999)));
    a3 = new Account();
    a3.setAccNumber(String.valueOf(dataProvider.faker.number().numberBetween(11111, 9999)));
    User user = new User();
    List<Account> accounts = new ArrayList<>();
    accounts.add(a1);
    accounts.add(a2);
    accounts.add(a3);

    user.setAccounts(accounts);
    ObjectDAO.saveObject(user);
  }
}
