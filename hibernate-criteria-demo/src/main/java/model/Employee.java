package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int eId;
  String eName;
  long eSalary;
  @ManyToOne(cascade = CascadeType.ALL)
  Department department;
}
