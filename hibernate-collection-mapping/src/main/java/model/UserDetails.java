package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserDetails")
@ToString
public class UserDetails {
  @Id

  @Column(name = "USER_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long userId;
  @Column(name = "USER_NAME")
  private String userName;
  @ElementCollection
  private Collection<Address> lisOfAddresses = new ArrayList<Address>();
  @ElementCollection
  @JoinTable(name = "USER_PHONENUMBERS",
      joinColumns = @JoinColumn(name = "USER_ID"))
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();

}