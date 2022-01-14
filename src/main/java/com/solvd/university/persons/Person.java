package com.solvd.university.persons;

public abstract class Person {
    String name;
    String surname;
    protected int age;
    protected String gender;
    protected boolean isActive;
    
    public Person(){

    }

    public Person(String name, String surname, int age, String gender, boolean isActive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.isActive = isActive;
    }
    
    Person(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", gender=" + gender + ", isActive=" + isActive + ", name=" + name + ", surname="
                + surname + "]";
    }

    
    


}
