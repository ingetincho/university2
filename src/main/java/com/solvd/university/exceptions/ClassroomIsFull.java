package com.solvd.university.exceptions;

public class ClassroomIsFull extends RuntimeException{
    
    public ClassroomIsFull(String message){
        super(message);
    }
}
