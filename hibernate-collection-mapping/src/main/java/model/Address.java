package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString
//for value object it is not is an entity object. Value object means does not have real meaning for self individually.
public class Address {
  @Column(name = "”STREET_NAME”")
  private String street;
  @Column(name = "CITY_NAME")
  private String city;
  @Column(name = "STATE_NAME")
  private String state;
  @Column(name = "PIN_CODE")
  private String pincode;

}