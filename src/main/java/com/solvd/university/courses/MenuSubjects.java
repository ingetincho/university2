package com.solvd.university.courses;

import java.util.Scanner;


import com.solvd.university.user.GenericsImp;
import com.solvd.university.user.IGenerics;

import org.apache.log4j.Logger;

public class MenuSubjects{
    
    private static final Logger log = Logger.getLogger(MenuSubjects.class);
    
    IGenerics subjectItems = new GenericsImp();
   
    public void subjectsMenu(){
        
        int option=-1;
        
        Scanner sc = new Scanner(System.in);

        while(option!=0){

            log.info("\n - Select option: \n"
            + "1. - Init File\n"
            + "2. - Add Subject\n"
            + "3. - List Subjects in File\n"
            + "4. - Search Subject\n"
            + "0. - Exit\n\n "
            + "Your Option:");

            option = Integer.parseInt(sc.nextLine());
            
            switch (option){

                case 1: subjectItems.initFile();
                        break;

                case 2: log.info("Subject to add: ");
                        String nombre = sc.nextLine();
                        subjectItems.add(nombre);
                        break;

                case 3: subjectItems.list();
                        break;
                
                case 4: log.info("Subject to search: ");
                        String search = sc.nextLine();
                        subjectItems.search(search);
                        break;
                        
                case 0: break;

                default: log.info("Try again please");
                        break;

            }
            sc.close();
        }
    }


}
