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

    public Subject(String line) {
        this.name = line;
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
        return this.name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idSubject;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (state ? 1231 : 1237);
        result = prime * result + totalHours;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Subject other = (Subject) obj;
        if (idSubject != other.idSubject)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (state != other.state)
            return false;
        if (totalHours != other.totalHours)
            return false;
        return true;
    }

    


}
