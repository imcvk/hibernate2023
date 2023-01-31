package models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(name = "vehicleId")
public class Car extends Vehicle{
  String carName;
  String carNumber;

  public Car(int vehicleId, String type, String name, String carName, String carNumber) {
    super(vehicleId, type, name);
    this.carName = carName;
    this.carNumber = carNumber;
  }

  public Car(String type, String name, String carName, String carNumber) {
    super(type, name);
    this.carName = carName;
    this.carNumber = carNumber;
  }

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public String getCarNumber() {
    return carNumber;
  }

  public void setCarNumber(String carNumber) {
    this.carNumber = carNumber;
  }
}
