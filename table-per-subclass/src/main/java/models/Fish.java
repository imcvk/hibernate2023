package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Fish")
public class Fish extends Animal {

  private boolean gills;
  private boolean livesInWater;



  public Fish(boolean gills, boolean livesInWater) {
    super();
    this.gills = gills;
    this.livesInWater = livesInWater;
  }

  public Fish(Long id, String type, String name, int weight, boolean gills, boolean livesInWater) {
    super(id, type, name, weight);
    this.gills = gills;
    this.livesInWater = livesInWater;
  }
// Getters and Setters

  public boolean isGills() {
    return gills;
  }

  public void setGills(boolean gills) {
    this.gills = gills;
  }

  public boolean isLivesInWater() {
    return livesInWater;
  }

  public void setLivesInWater(boolean livesInWater) {
    this.livesInWater = livesInWater;
  }
}