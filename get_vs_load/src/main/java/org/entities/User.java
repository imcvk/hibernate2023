package org.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


//this is used to tell that this is entity class and table need to create for this one.
@Entity
//used to set table attributes
@Table(name = "user_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userid;
    String username;
    @Temporal(TemporalType.DATE)
    Date DOB;
    @Transient
    String gender;


}
