package mainapp;

import dao.EmpDAO;
import models.Contract_Employee;
import models.Employee;
import models.Regular_Employee;

public class MainApp {
  public static void main(String[] args) {
    Employee e = new Employee();
    e.setName("steve");
    Regular_Employee regular_employee = new Regular_Employee();
    regular_employee.setrEmpName("fdsdfdf");
    Contract_Employee contract_employee = new Contract_Employee();
    contract_employee.setCempName("sdfsdf");
    EmpDAO.saveObject(e);
    EmpDAO.saveObject(regular_employee);
    EmpDAO.saveObject(contract_employee);
  }
}
