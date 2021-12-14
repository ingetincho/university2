package com.solvd.university.databases;

import java.util.List;

import com.solvd.university.courses.Subject;
import com.solvd.university.exceptions.*;


public interface IDataAccess {
    
    boolean ifexist(String resourceName) throws DataAccessEx;

    List<Subject> list(String resourceName) throws ReadDataEx;

    void write(Subject subject, String resourceName, boolean append) throws WriteDataEx;

    String search (String resouceName,String search) throws ReadDataEx;

    void create (String resourceName) throws DataAccessEx;
    void erase(String resourceName) throws DataAccessEx;
    

}
