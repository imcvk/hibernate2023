package model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
public class Regular_Employee extends Employee {

  @Column(name = "salary")
  private float salary;

  @Column(name = "bonus")
  private int bonus;

//setters and getters

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }
}