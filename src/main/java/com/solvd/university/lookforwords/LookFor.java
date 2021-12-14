package com.solvd.university.lookforwords;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


public class LookFor {
    
    private static final Logger log = Logger.getLogger(LookFor.class);

    public void search(){

        Scanner console = new Scanner(System.in);

        File destinationFile = new File("src\\main\\java\\resources\\countingwords.txt");
      
        try {
            FileUtils.touch(destinationFile);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        

        String charsets = "UTF-8";
        String text = "";
        File file = 
        new File("src\\main\\java\\resources\\article.txt");
        String content;
        int i;
           
        try{
            
            content = FileUtils.readFileToString(file, charsets);
            log.info(content);
                        
            do{
                
                log.info("Input word to find: ");
                text = console.nextLine();
                
                i = StringUtils.countMatches(content,text);
                log.info("I found : "+i+" words "+text);
                
                if(!text.isEmpty()){

                    String data = text + "\t\t\t\t"+ i + "\n";
                    FileUtils.writeStringToFile(destinationFile, data, charsets, true);

                }

            }while (!text.isEmpty());
        }catch (IOException e) {
            e.printStackTrace();
        }

        console.close();

    }
}
