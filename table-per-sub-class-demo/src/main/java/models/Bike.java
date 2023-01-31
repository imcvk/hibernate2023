package models;

import jakarta.persistence.Entity;

@Entity
//@PrimaryKeyJoinColumn(name = "vehicleId")
public class Bike extends Vehicle {
  String bikeName;
  String bikeNumber;

  public Bike(String bikeName, String bikeNumber) {
    this.bikeName = bikeName;
    this.bikeNumber = bikeNumber;
  }

  public Bike(int vehicleId, String type, String name, String bikeName, String bikeNumber) {
    super(vehicleId, type, name);
    this.bikeName = bikeName;
    this.bikeNumber = bikeNumber;
  }

  public Bike(String type, String name, String bikeName, String bikeNumber) {
    super(type, name);
    this.bikeName = bikeName;
    this.bikeNumber = bikeNumber;
  }

  public String getBikeName() {
    return bikeName;
  }

  public void setBikeName(String bikeName) {
    this.bikeName = bikeName;
  }

  public String getBikeNumber() {
    return bikeNumber;
  }

  public void setBikeNumber(String bikeNumber) {
    this.bikeNumber = bikeNumber;
  }
}
