package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Birds")
public class Bird extends Animal {

  private int numberOfWings;
  private boolean canFly;

  // Getters and Setters

  public Bird(int numberOfWings, boolean canFly) {
    super();
    this.numberOfWings = numberOfWings;
    this.canFly = canFly;
  }

  public Bird(Long id, String type, String name, int weight, int numberOfWings, boolean canFly) {
    super(id, type, name, weight);
    this.numberOfWings = numberOfWings;
    this.canFly = canFly;
  }

  public int getNumberOfWings() {
    return numberOfWings;
  }

  public void setNumberOfWings(int numberOfWings) {
    this.numberOfWings = numberOfWings;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }
}