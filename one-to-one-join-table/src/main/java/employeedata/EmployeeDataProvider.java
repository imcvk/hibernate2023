package employeedata;

import com.github.javafaker.Faker;

public class EmployeeDataProvider {

  public static String address;
  public Faker faker;
  public int employeeId;
  public String firstName;
  public String lastName;
  public String fullName;
  public String emailId;
  public String phoneNumber;

  public EmployeeDataProvider() {
    faker = new Faker();
  }

  public int getEmployeeId() {
    employeeId = Integer.parseInt(faker.number().digits(6));
    return employeeId;
  }

  public String getFakeEmployeeNameFull() {
    lastName = faker.name().lastName();
    firstName = faker.name().firstName();
    fullName = lastName + "," + firstName;
    return fullName;
  }

  public String getFakeEmployeeNameFirst() {
    getFakeEmployeeNameFull();
    return firstName;
  }

  public String getFakeEmployeeNameLast() {
    getFakeEmployeeNameFull();
    return lastName;
  }

  public String getPhoneNumber() {
    phoneNumber = faker.phoneNumber().cellPhone();
    return phoneNumber;
  }

  public String getEmailId() {
    emailId = firstName + "." + lastName + "@gmail.com";
    return emailId;
  }

  public String getAddress() {
    address = faker.address().fullAddress();
    return address;
  }
}
