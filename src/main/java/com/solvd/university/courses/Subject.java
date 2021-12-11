package com.solvd.university.courses;



public class Subject implements Grades {
    private String name;
    private int idSubject;
    private int totalHours;
    private boolean state;
    

    public Subject(){
        this.state=false;
    }

    public Subject(String name, int idSubject, int totalHours) {
        this.name = name;
        this.idSubject = idSubject;
        this.totalHours = totalHours;
        this.state = false;
    }

    @Override
    public double printGrade() {
        return GRADE;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }




    @Override
    public String toString() {
        return "Subject [ idSubject=" + idSubject + ", name=" + name + ", totalHours=" + totalHours + "]";
    }
}
