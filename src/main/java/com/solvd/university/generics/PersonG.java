package com.solvd.university.generics;

import com.solvd.university.persons.Person;

public class PersonG<T extends Person> {

    public  String getName(T e){
        return e.getName();
    }
    public  void updateName(T e, String newName){
        e.setName(newName);
    }
    
}
