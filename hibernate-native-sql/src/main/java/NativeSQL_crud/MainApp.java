package NativeSQL_crud;

import dummydata.DummyUserProvider;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
  public static void main(String[] args) {
    DAO dao = new DAO();
    DummyUserProvider provider = new DummyUserProvider();
    List<Employee> employees = new ArrayList<>();
    Employee e = new Employee();
    for(int i = 0; i < 20; i++) {
      e = new Employee();
      e.setEname(provider.getFakeEmployeeNameFull());
      dao.saveObject(e);
    }
    /**-----------------------------------------------------------------------------------------------------------------
     * Delete
     * */
    System.out.println("Number of records deleted: " + dao.delete_using_NativeSQL(e.getEid()));
    /**-----------------------------------------------------------------------------------------------------------------
     * fetch list of employees using hql
     * */
    employees = dao.get_all_employees_using_NativeSQL();
    for(Employee emp : employees)
      System.out.println(emp);
    /**-----------------------------------------------------------------------------------------------------------------
     * unique record using hql
     * */
    System.out.println("unique record using hql-");
    System.out.println(dao.getUniqueEmployee(1));
    /**-----------------------------------------------------------------------------------------------------------------
     * update
     * */
    Employee employee1 = new Employee();
    employee1.setEid(1);
    employee1.setEname(provider.getFakeEmployeeNameFull());
    Employee temp = dao.getUniqueEmployee(employee1.getEid());
    System.out.println("BEFORE UPDATE:" + temp);
    dao.update_employee_NativeSQL(employee1);
    temp = dao.getUniqueEmployee(employee1.getEid());
    System.out.println("AFTER UPDATE:" + temp);
  }
}
