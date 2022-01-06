package com.solvd.university.databases;

import java.util.ArrayList;
import java.util.List;

import com.solvd.university.persons.Person;
import org.apache.log4j.Logger;

public class TeachersList extends Person {
    
    private static final Logger log = Logger.getLogger(TeachersList.class);

    private List<Person> teachers = new ArrayList<>();

    public TeachersList(){
        super();
    }

    public void addTeacher(Person teacher){
        this.teachers.add(teacher);
    }

    public void listOfTeachers(){
        
        this.teachers.forEach((x)-> {log.info(x);});
        
    }
    

}
