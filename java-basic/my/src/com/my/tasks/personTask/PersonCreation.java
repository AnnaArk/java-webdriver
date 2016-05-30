package com.my.tasks.personTask;

/*
 * Created by Anna_Arkhipova on 6/19/2016.
 */


public class PersonCreation {

    //Method that creates person without arguments using default constructor
    public Person createPerson() {

        System.out.println();
        System.out.println("Person task");
        Person p1 = new Person();
        return p1;
    }

    //Method that creates person with arguments using constructor with parameters
    public Person createPerson(String name, String surname, String email) {
        System.out.println();
        System.out.println("Person task");
        Person p1 = new Person(name, surname, email);
        return p1;
    }


}
