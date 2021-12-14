package com.solvd.university.persons;

import java.util.Date;
import java.util.LinkedHashSet;
import com.solvd.university.courses.Subject;

public class Student extends Person{
    private int idStudent;
    private static int idStudentCounter;
    private Date date;
    LinkedHashSet<Subject> subjetsList = new LinkedHashSet<>();
    

    public Student(){
        this.idStudent = ++Student.idStudentCounter;
    }

    public Student(String name,String surname){
        super(name, surname);
        this.idStudent = ++Student.idStudentCounter;
    }

    public void addSubject(Subject subject){
        subjetsList.add(subject);
    }

    public void listSubjects(){
        for(Subject s:this.subjetsList){
            System.out.println(s);
        }
    }


    public void setStudentName(String name){
        super.setName(name);
    }

    public int getIdStudent() {
        return idStudent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LinkedHashSet<Subject> getSubjetsList() {
        return subjetsList;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Subject && this.subjetsList.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.subjetsList.hashCode();
    }

        


    


}
