package mainapp;

import dao.ObjectDao;
import models.User;

import java.util.List;

public class MainApp {
  public static void main(String[] args) {
    User user = new User();
    ObjectDao objectDao = new ObjectDao();
    for(int i = 0; i < 20; i++) {
      user = getUser();
      objectDao.saveObject(user);
    }
    List<User> userList = objectDao.selectUserList();
    userList.forEach(System.out::println);
    user = objectDao.selectUnique(20);
    System.out.println(user);
    user = getUser();
    objectDao.update(user);
    System.out.println(objectDao.selectUnique(user.getId()));
  }

  public static User getUser() {
    DummyUserProvider provider = new DummyUserProvider();
    User user = new User();
    user.setName(provider.getFakeEmployeeNameFull());
    user.setEmail(provider.getEmailId());
    user.setAddress(provider.getAddress());
    user.setPhoneNo(provider.getPhoneNumber());
    user.setDob(provider.faker.date().birthday());
    return user;
  }
}
