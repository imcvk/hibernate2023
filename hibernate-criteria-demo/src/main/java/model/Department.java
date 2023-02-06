package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQuery(name = "department.byId", query = "from Department where dId=:id")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int dId;
  String dName;
}
