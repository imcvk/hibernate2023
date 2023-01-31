package model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Cat")
public class Cat extends Animal {
  private int numberOfLives;

  // other properties and methods

  public Cat(int numberOfLives) {
    this.numberOfLives = numberOfLives;
  }

  public Cat(long id, String name, int numberOfLives) {
    super(id, name);
    this.numberOfLives = numberOfLives;
  }

  public Cat(String name, int numberOfLives) {
    super(name);
    this.numberOfLives = numberOfLives;
  }

  public int getNumberOfLives() {
    return numberOfLives;
  }

  public void setNumberOfLives(int numberOfLives) {
    this.numberOfLives = numberOfLives;
  }
}
