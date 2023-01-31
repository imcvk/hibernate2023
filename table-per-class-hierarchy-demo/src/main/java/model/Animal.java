package model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type")
public class Animal {
  @Id
  @GeneratedValue
  private long id;
  private String name;
  // other properties and methods

  public Animal() {
  }

  public Animal(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Animal(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
