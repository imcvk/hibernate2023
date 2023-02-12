package mainapp;

import dao.ObjectDao;
import dummydata.DummyUserProvider;
import model.User;

import java.util.List;

public class MainApp {
  public static void main(String[] args) {
    ObjectDao objectDao = new ObjectDao();
    User user,user2;
    /*
     * Insert user
     * */

      System.out.println("---------------------------------------------------------------------------------------------");
      user = getNewUser();
      user2=user;
      objectDao.saveObject(user);

    System.out.println("---------------------------------------------------------------------------------------------");
    /*
     * delete user using userid
     * */
    System.out.println("---------------------------------------------------------------------------------------------");
    System.out.println("Deleting user.\n" + user2);
    objectDao.deleteUser(user2);
    System.out.println("---------------------------------------------------------------------------------------------");
    /*
     * Update user
     * */
//    System.out.println("---------------------------------------------------------------------------------------------");
//    user = getNewUser();
//    user.setId(1);
//    objectDao.updateDetails(user);
//    System.out.println("---------------------------------------------------------------------------------------------");
    /*
     * merge() in hibernate
     * */
    System.out.println("---------------------------------------------------------------------------------------------");
    user = getNewUser();
    user.setId(2);
    objectDao.mergeUser(user);
    System.out.println("---------------------------------------------------------------------------------------------");

    /*
     * fetch single user
     * */
    System.out.println("---------------------------------------------------------------------------------------------");
    user = objectDao.getSingleUser(1);
    System.out.println(user);
    System.out.println("---------------------------------------------------------------------------------------------");
    /*
     * get all users
     * */
    System.out.println("---------------------------------------------------------------------------------------------");
    List<User> users = objectDao.getUsers();
    users.forEach(System.out::println);
    System.out.println("---------------------------------------------------------------------------------------------");

  }

  public static User getNewUser() {
    DummyUserProvider provider = new DummyUserProvider();
    User user = new User();
    user.setName(provider.getFakeEmployeeNameFull());
    user.setEmailId(provider.getEmailId());
    user.setPhoneNumber(provider.getPhoneNumber());
    user.setAddress(provider.getAddress());
    return user;
  }

}
