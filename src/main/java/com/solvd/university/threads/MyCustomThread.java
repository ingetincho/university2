package com.solvd.university.threads;

import java.lang.Thread;

import org.apache.log4j.Logger;

public class MyCustomThread extends Thread{

    private static final Logger log = Logger.getLogger(MyCustomThread.class);
    
    @Override
    public void start(){
        int i=0;
       
            log.debug("Line: "+i+" Thread No.: " + super.getId());
        
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            
            log.debug("Pause ends " + super.getId());
            
    }
}