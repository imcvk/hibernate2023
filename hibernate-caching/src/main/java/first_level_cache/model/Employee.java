package first_level_cache.model;

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
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Department department;
}
