package hql_crud;

import dummydata.DummyUserProvider;

import java.util.List;

public class MainApp {
  public static void main(String[] args) {
    DAO dao = new DAO();
    DummyUserProvider provider = new DummyUserProvider();

    for(int i = 0; i < 20; i++) {
      Employee e = new Employee();
      e.setEname(provider.getFakeEmployeeNameFull());
      dao.saveObject(e);
    }
    /**
     * fetch list of employees using hql
     * */
    List<Employee> employees = dao.get_all_employees_using_HQL();
    for(Employee e : employees)
      System.out.println(e);
    /**
     * unique record using hql
     * */
    Employee e = dao.getUniqueEmployee(1);
    System.out.println(e);
    /**
     * Delete
     * */
    System.out.println("Number of records deleted: " + dao.delete_using_hql(11));
  }
}
