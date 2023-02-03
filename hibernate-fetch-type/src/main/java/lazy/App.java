package lazy;

import dao.ObjectDAO;

public class App {
    public static void main(String[] args) {

        Student s = new Student();
        Address a = new Address();
        a.setCity("sdfsdf");
        a.setState("sdfsdf");
        a.setCountry("sdfsdf");
        s.setAddress(a);
        s.setSname("sdfsdf");
        ObjectDAO.saveObject(s);
        Student student = ObjectDAO.getStudent(1);
        System.out.println(student);
    }
}
