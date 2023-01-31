package models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "vehicleId")
  int vehicleId;
  String type;
  String name;

  public Vehicle() {
  }

  public Vehicle(int vehicleId, String type, String name) {
    this.vehicleId = vehicleId;
    this.type = type;
    this.name = name;
  }

  public Vehicle(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public int getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
