package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
    @NamedQuery(name = "fetchSingleEmployeeById", query = "from Employee where eId=:eid"),
    @NamedQuery(name = "fetchAllEmployees", query = "from Employee"),
    @NamedQuery(name = "deleteEmployeeUsingId", query = "delete from Employee e where e.eId=:eid")
})
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int eId;
  String eName;
  @ManyToOne(cascade = CascadeType.ALL)
  Department department;
}
