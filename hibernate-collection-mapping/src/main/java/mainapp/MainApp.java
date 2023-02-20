package mainapp;

import dao.ObjectDao;
import dummydata.DummyUserProvider;
import model.Address;
import model.PhoneNumber;
import model.UserDetails;

import java.util.ArrayList;
import java.util.List;

//source - https://www.dineshonjava.com/hibernate-3-on-baby-steps/
public class MainApp {
  public static void main(String[] args) {
    ObjectDao objectDao = new ObjectDao();
    UserDetails user = getNewUser();//Create user object

    Address address1 = getAddress(); // create first embedded object address
    Address address2 = getAddress(); // create second embedded object address
    PhoneNumber p1 = getPhoneNumber();
    PhoneNumber p2 = getPhoneNumber();

//adding addresses object to the list of address
    user.getLisOfAddresses().add(address1);
    user.getLisOfAddresses().add(address2);
    List<PhoneNumber> phoneNumbers = new ArrayList<>();
    phoneNumbers.addAll(List.of(new PhoneNumber[]{p1, p2}));
    user.setPhoneNumbers(phoneNumbers);
    objectDao.saveObject(user);
  }

  public static UserDetails getNewUser() {
    DummyUserProvider provider = new DummyUserProvider();
    UserDetails user = new UserDetails();
    user.setUserName(provider.getFakeEmployeeNameFull());
    return user;
  }

  public static Address getAddress() {
    DummyUserProvider provider = new DummyUserProvider();
    Address address = new Address();
    address.setStreet(provider.faker.address().streetName());
    address.setCity(provider.faker.address().city());
    address.setState(provider.faker.address().state());
    address.setPincode(provider.faker.address().zipCode());
    return address;
  }

  public static PhoneNumber getPhoneNumber() {
    DummyUserProvider provider = new DummyUserProvider();
    PhoneNumber phoneNumber = new PhoneNumber();
    phoneNumber.setPhoneNumber(provider.getPhoneNumber());
    return phoneNumber;
  }
}
