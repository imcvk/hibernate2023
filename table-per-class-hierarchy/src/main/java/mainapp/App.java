package mainapp;

import dao.AnimalDAO;
import model.*;

public class App {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.setName("Gaurav Chawla");

    Regular_Employee e2 = new Regular_Employee();
    e2.setName("Vivek Kumar");
    e2.setSalary(50000);
    e2.setBonus(5);

    Contract_Employee e3 = new Contract_Employee();
    e3.setName("Arjun Kumar");
    e3.setPay_per_hour(1000);
    e3.setContract_duration("15 hours");
    AnimalDAO.saveObject(e1);
    AnimalDAO.saveObject(e2);
    AnimalDAO.saveObject(e3);

  }
}
