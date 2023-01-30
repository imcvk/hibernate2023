package mainapp;

import dao.EmployeeDAO;
import employeedata.EmployeeDataProvider;
import model.Employee;

public class App {
  public static void main(String[] args) {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    EmployeeDataProvider eDp = new EmployeeDataProvider();
    for(int i = 0; i < 10; i++) {
      Employee e = new Employee(eDp.getFakeEmployeeNameFirst(), eDp.getFakeEmployeeNameLast());
      employeeDAO.saveEmployee(e);
    }
  }
}
