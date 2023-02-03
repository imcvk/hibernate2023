package eager;

import dao.ObjectDAO;

public class EagerApp {
    public static void main(String[] args) {
        Employee e = new Employee();
        Department d = new Department();
        d.setDName("sdfsdf");
        e.setEName("asdas");
        e.setDepartment(d);
        ObjectDAO.saveObject(e);
        Employee employee = ObjectDAO.getEmployee(2);
        System.out.println(employee.getEName());
    }
}
