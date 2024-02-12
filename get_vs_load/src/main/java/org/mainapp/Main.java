package org.mainapp;

import com.github.javafaker.Faker;
import org.DAO.DB_Operations;
import org.entities.User;


public class Main {
    public static void main(String[] args) {
        DB_Operations dbOperations = new DB_Operations();

        System.out.println(dbOperations.getUser(2));
        System.out.println(dbOperations.getUser(2000));
        System.out.println(dbOperations.loadUser(2));
        System.out.println(dbOperations.loadUser(2000));

    }

    public static User createUserObject() {
        Faker f = new Faker();
        User u = new User();
        u.setUsername(f.name().name());
        u.setDOB(f.date().birthday());
        u.setGender("Male");
        return u;
    }


}
