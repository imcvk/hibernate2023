package mainapp;

import dao.ObjectDAO;
import employeedata.EmployeeDataProvider;
import model.Department;
import model.Employee;

public class App {
  public static void main(String[] args) {
    EmployeeDataProvider dataProvider = new EmployeeDataProvider();
    Employee e1, e2, e3;
    e1 = new Employee();
    e1.setName(dataProvider.getFakeEmployeeNameFull());

    Department d = new Department();
    d.setName("CS");
    Department d1 = new Department();
    d1.setName("Physics");
    ObjectDAO.saveObject(d);
    ObjectDAO.saveObject(d1);
  }
}
