package second_level_cache.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int eId;
    String eName;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Stream stream;
}
