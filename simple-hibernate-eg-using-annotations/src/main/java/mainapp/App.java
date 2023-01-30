package mainapp;

import dao.EmployeeDAO;
import employeedata.EmployeeDataProvider;
import model.Employee;

public class App {
  public static void main(String[] args) {
    EmployeeDataProvider edp = new EmployeeDataProvider();
    EmployeeDAO e = new EmployeeDAO();
    Employee employee = new Employee(edp.getFakeEmployeeNameFirst(), edp.getFakeEmployeeNameLast());
    e.saveEmployee(employee);
  }
}
