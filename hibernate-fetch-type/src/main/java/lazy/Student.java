package lazy;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String sname;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Address address;
}
