package mainapp;

import dao.EmployeeDAO;
import employeedata.EmployeeDataProvider;
import model.Employee;

public class MainApp {
  public static void main(String[] args) {
    EmployeeDataProvider dataProvider = new EmployeeDataProvider();

    Employee e = new Employee(dataProvider.getEmployeeId(), dataProvider.getFakeEmployeeNameFirst(), dataProvider.getFakeEmployeeNameLast());
    EmployeeDAO.saveEmployee(e);
  }
}
