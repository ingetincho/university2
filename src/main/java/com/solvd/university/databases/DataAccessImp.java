package com.solvd.university.databases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.solvd.university.courses.Subject;
import com.solvd.university.exceptions.*;
import org.apache.log4j.Logger;

public class DataAccessImp implements IDataAccess {

    private static final Logger log = Logger.getLogger(DataAccessImp.class);


    @Override
    public boolean ifexist(String resourceName){
        File file = new File (resourceName);
        return file.exists();
    }

    @Override
    public List<Subject> list(String resourceName) {
        List<Subject> subjects = new ArrayList<>();

        try {
            BufferedReader input = new BufferedReader(new FileReader(resourceName));

            String line = null;
            line = input.readLine();

            while(line!=null){
                Subject subject = new Subject(line);
                subjects.add(subject);
                line = input.readLine();
            }
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ReadDataEx("Impossible to list subjects " + e.getMessage());
        } catch (IOException e) {
            
            e.printStackTrace();
            throw new ReadDataEx("Impossible to list subjects " + e.getMessage());
        }
        
        return subjects;
    }

    @Override
    public void write(Subject subject, String resourceName, boolean append) {
        File file = new File(resourceName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, append));
            output.println(subject.toString());
            output.close();
            log.info("New Data added to file: " + subject);
        } catch (IOException e) {
            e.printStackTrace();
            throw new WriteDataEx("I can't write in file. " + e.getMessage());
        }
        
        
    }
    
    @Override
    public String search(String resouceName, String search) {
        File file = new File(resouceName);
        String outcome=null;
        
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            String line = null;
            line = read.readLine();
            int index = 1;
            while(line!=null){
                if(search!=null && search.equalsIgnoreCase(line)){
                    outcome = search + " Found on index " + index;
                    break;
                }
                index++;
                line = read.readLine();
            }
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new ReadDataEx("Impossible to search subjects " + e.getMessage());
            
        } catch (IOException e) {
            e.printStackTrace();
            throw new ReadDataEx("Impossible to search subjects " + e.getMessage());
        }
        return outcome;
    }

    @Override
    public void create(String resourceName){
        File file = new File(resourceName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file));
            output.close();
            log.info("File create succesfully!");
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataAccessEx("Impossible to create file " + e.getMessage());
        }
    }

    @Override
    public void erase(String resourceName) {
        
        File file = new File(resourceName);

        if(file.exists())
            file.delete();

        log.info("File sucessfully erased");    
    }
    
}
