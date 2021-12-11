package com.solvd.university.persons;

public class Teacher extends Person{
    
    private double salary;
    private static int teacherCounter;
    private int idTeacher;

    public Teacher(){
        super();
        this.idTeacher = ++Teacher.teacherCounter;
    }

    public Teacher(String name,String surname, double salary){
        super(name,surname);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getTeacherCounter() {
        return teacherCounter;
    }

    public static void setTeacherCounter(int teacherCounter) {
        Teacher.teacherCounter = teacherCounter;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "\nTeacher [idTeacher=" + idTeacher + ", salary=" + salary + "]\n" + super.toString();
    }

   
    
}
