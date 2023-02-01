package mainapp;

import dao.ObjectDAO;
import employeedata.EmployeeDataProvider;
import model.Address;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    EmployeeDataProvider dataProvider = new EmployeeDataProvider();

    Address address1, address2, address3;
    address1 = new Address();
    address1.setEmpAddress(dataProvider.getAddress());
    address2 = new Address();
    address2.setEmpAddress(dataProvider.getAddress());
    address3 = new Address();
    address3.setEmpAddress(dataProvider.getAddress());
    List<Address> addresses = new ArrayList<>();
    addresses.add(address1);
    addresses.add(address2);
    addresses.add(address3);

    Employee employee = new Employee();
    employee.setEmpName(dataProvider.getFakeEmployeeNameFull());
    employee.setAddresses(addresses);
    ObjectDAO.saveObject(employee);
  }
}
