package com.my.tasks.personTask;

import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Anna_Arkhipova on 6/19/2016.
 */

public class Person {

    String surname;
    String email;
    String name;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    //Constructor for Person
    public Person() {
        name = "emptyname";
        surname = "emptysurname";
        email = "emptyemail";
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public void personToString() {
        System.out.println("Person information:" + this.name + " " + this.surname + " " + this.email);
    }

}


