package mainapp;

import dao.ObjectDAO;
import employeedata.EmployeeDataProvider;
import model.Address;
import model.Employee;

public class App {
  public static void main(String[] args) {
    for(int i = 0; i < 50; i++) {
      EmployeeDataProvider dataProvider = new EmployeeDataProvider();
      Address address = new Address();
      address.setEmpAddress(dataProvider.getAddress());
      Employee employee = new Employee();
      employee.setEmpName(dataProvider.getFakeEmployeeNameFull());
      employee.setAddress(address);
      address.setEmployee(employee);
      ObjectDAO.saveObject(employee);
    }

  }
}


