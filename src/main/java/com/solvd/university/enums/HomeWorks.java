package com.solvd.university.enums;

public enum HomeWorks {
    TODO("To Do"),
    IN_PROGRESS("In Progress"),
    DONE("Done"),
    CANCELED("Canceled");

    private String status;

    HomeWorks(String status){
        this.status = status;
    }

    public String status(){
        return this.status;
    }
}
