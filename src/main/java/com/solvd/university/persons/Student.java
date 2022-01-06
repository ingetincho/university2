package com.solvd.university.persons;

import java.util.Date;
import java.util.LinkedHashSet;
import com.solvd.university.courses.Subject;
import com.solvd.university.enums.StudentConcept;

import org.apache.log4j.Logger;

public class Student extends Person {
    private static final Logger log = Logger.getLogger(Student.class);

    private int idStudent;
    private static int idStudentCounter;
    private Date date;
    LinkedHashSet<Subject> subjetsList = new LinkedHashSet<>();
    private StudentConcept concept;

    public Student() {
        this.idStudent = ++Student.idStudentCounter;
    }

    public Student(String name, String surname) {
        super(name, surname);
        this.idStudent = ++Student.idStudentCounter;
    }

    public void addSubject(Subject subject) {
        subjetsList.add(subject);
    }

    public void listSubjects(){
        
        this.subjetsList.forEach((x)->{
            log.info(x);
        });
        
        }

    public void setStudentName(String name) {
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

    


    public StudentConcept getConcept() {
        return concept;
    }

    public void setConcept(StudentConcept concept) {
        this.concept = concept;
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
