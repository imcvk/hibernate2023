package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Mammals")
public class Mammal extends Animal {

  private int numberOfLegs;
  private boolean warmBlooded;

  // Getters and Setters

  public Mammal(int numberOfLegs, boolean warmBlooded) {
    super();
    this.numberOfLegs = numberOfLegs;
    this.warmBlooded = warmBlooded;
  }

  public Mammal(Long id, String type, String name, int weight, int numberOfLegs, boolean warmBlooded) {
    super(id, type, name, weight);
    this.numberOfLegs = numberOfLegs;
    this.warmBlooded = warmBlooded;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  public void setNumberOfLegs(int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }

  public boolean isWarmBlooded() {
    return warmBlooded;
  }

  public void setWarmBlooded(boolean warmBlooded) {
    this.warmBlooded = warmBlooded;
  }
}