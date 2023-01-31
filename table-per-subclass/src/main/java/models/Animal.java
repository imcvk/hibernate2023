package models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="Animals")
public class Animal {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String type;
  private String name;
  private int weight;

  // Getters and Setters



  public Animal(Long id, String type, String name, int weight) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.weight = weight;
  }

  public Animal(String type, String name, int weight) {
    this.type = type;
    this.name = name;
    this.weight = weight;
  }

  public Animal() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}