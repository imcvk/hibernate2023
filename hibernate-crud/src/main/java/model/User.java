package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String emailId;
    String address;
    String phoneNumber;

    @Override
    public String toString() {
        return "User id::" + id + "," +
                "User name::" + name + "," +
                "Email id::" + emailId + "," +
                "Phone number::" + phoneNumber + "," +
                "Address::" + address;
    }
}
