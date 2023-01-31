package model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_table_per_class_hierarchy")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")

public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;

//setters and getters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}