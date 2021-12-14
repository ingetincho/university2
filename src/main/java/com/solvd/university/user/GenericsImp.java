package com.solvd.university.user;

import java.security.cert.X509CRLEntry;
import java.util.List;

import com.solvd.university.courses.Subject;
import com.solvd.university.databases.DataAccessImp;
import com.solvd.university.databases.IDataAccess;
import com.solvd.university.exceptions.DataAccessEx;
import com.solvd.university.exceptions.ReadDataEx;

import org.apache.log4j.Logger;

public class GenericsImp implements IGenerics{

    private static final Logger log = Logger.getLogger(GenericsImp.class);
    
    private final IDataAccess data;

    public GenericsImp() {
        this.data = new DataAccessImp();
    }


    @Override
    public void add(String nombre) {
        Subject subject = new Subject(nombre);
        boolean append=false;
        try {
            append=data.ifexist(SUBJECTS_FILENAME);
            data.write(subject, SUBJECTS_FILENAME, append);
        } catch (DataAccessEx e) {
            e.printStackTrace();
            log.info("Data Access Error");
        }
    }

    @Override
    public void initFile() {
         try {
            if(this.data.ifexist(SUBJECTS_FILENAME)){
                data.erase(SUBJECTS_FILENAME); 
                data.create(SUBJECTS_FILENAME);
             }else{
                 data.create(SUBJECTS_FILENAME);
             }
             
        } catch (DataAccessEx e) {
            e.printStackTrace();
            log.info("Data Access Error");
        }
        
    }

    @Override
    public void list() {
        try {
            List<Subject> subject = this.data.list(SUBJECTS_FILENAME);
            for(Subject x:subject){
                log.info("Subject: "+ x);
            }

        } catch (DataAccessEx e) {
            e.printStackTrace();
            log.info("Data Access Error");
        }
        
    }

    @Override
    public void search(String search) {
        String outcome=null;
        try {
            outcome = this.data.search(SUBJECTS_FILENAME, search);
            log.info(outcome);
        } catch (ReadDataEx e) {
            e.printStackTrace();
            log.info("Can't Read File.");
        }

        
    }

    
}
