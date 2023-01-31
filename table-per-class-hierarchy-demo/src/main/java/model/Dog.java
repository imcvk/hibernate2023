package model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Dog")
public class Dog extends Animal {
  private String breed;

  public Dog(String breed) {
    this.breed = breed;
  }

  public Dog(long id, String name, String breed) {
    super(id, name);
    this.breed = breed;
  }

  public Dog(String name, String breed) {
    super(name);
    this.breed = breed;
  }
  // other properties and methods

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }
}
