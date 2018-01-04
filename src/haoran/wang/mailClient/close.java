/*
 * ® Copyright 2017-2018 Haoran Wang. All rights reserved.
 * 
 * The works in this project are licenced under a 
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported 
 * (CC BY-NC-SA 3.0) Licence.
 * 
 * That is to say, you may freely modify the work, quote the content of the work, 
 * and use it for other purposes, as long as it's non-commercial. 
 * If you want to distribute the work, you need to give appropriate credit and make 
 * sure it is under the same licence as the original, 
 * in this case, a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported (CC BY-NC-SA 3.0) Licence should be applied.
 */
package haoran.wang.mailClient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author HaoranWang
 */
public class close {
    
    
    static final void storeInFile()
    {
        // directory of the binary file
        String path = "/Users/HaoranWang/Documents/GitHub/Mail Client/data/data.bin";   
        try
        {
            FileOutputStream fileOS = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fileOS); 
            // reset the binary file
            os.reset();
            // write the number of emails
            os.writeInt(data.numOfEmail);
            System.out.println(data.numOfEmail);
            
            switch(data.numOfEmail)
            {
                case 1: 
                {
                    // 1st email
                    os.writeChars(data.email1.getName());
                    os.writeChars(data.email1.getPassword());
                    os.writeChars(data.email1.getType());
                }
                case 2:
                {
                    // 1st email
                    os.writeChars(data.email1.getName());
                    os.writeChars(data.email1.getPassword());
                    os.writeChars(data.email1.getType());
                    // 2nd email
                    os.writeChars(data.email2.getName());
                    os.writeChars(data.email2.getPassword());
                    os.writeChars(data.email2.getType());                    
                }
                case 3:
                {
                    // 1st email
                    os.writeChars(data.email1.getName());
                    os.writeChars(data.email1.getPassword());
                    os.writeChars(data.email1.getType());
                    // 2nd email
                    os.writeChars(data.email2.getName());
                    os.writeChars(data.email2.getPassword());
                    os.writeChars(data.email2.getType());   
                    // 3rd email
                    os.writeChars(data.email3.getName());
                    os.writeChars(data.email3.getPassword());
                    os.writeChars(data.email3.getType());                      
                }
                case 4:
                {
                    // 1st email
                    os.writeChars(data.email1.getName());
                    os.writeChars(data.email1.getPassword());
                    os.writeChars(data.email1.getType());
                    // 2nd email
                    os.writeChars(data.email2.getName());
                    os.writeChars(data.email2.getPassword());
                    os.writeChars(data.email2.getType());   
                    // 3rd email
                    os.writeChars(data.email3.getName());
                    os.writeChars(data.email3.getPassword());
                    os.writeChars(data.email3.getType());  
                    // 4th email
                    os.writeChars(data.email4.getName());
                    os.writeChars(data.email4.getPassword());
                    os.writeChars(data.email4.getType());                       
                }
                case 5:
                {
                    // 1st email
                    os.writeChars(data.email1.getName());
                    System.out.println(data.email1.getName());
                    os.writeChars(data.email1.getPassword());
                    System.out.println(data.email1.getPassword());
                    os.writeChars(data.email1.getType());
                    System.out.println(data.email1.getType());
                    // 2nd email
                    os.writeChars(data.email2.getName());
                    System.out.println(data.email2.getName());
                    os.writeChars(data.email2.getPassword());
                    System.out.println(data.email2.getPassword());
                    os.writeChars(data.email2.getType());
                    System.out.println(data.email1.getType());
                    // 3rd email
                    os.writeChars(data.email3.getName());
                    System.out.println(data.email3.getName());
                    os.writeChars(data.email3.getPassword());
                    System.out.println(data.email3.getPassword());
                    os.writeChars(data.email3.getType());
                    System.out.println(data.email1.getType());
                    // 4th email
                    os.writeChars(data.email4.getName());
                    System.out.println(data.email4.getName());
                    os.writeChars(data.email4.getPassword());
                    System.out.println(data.email4.getPassword());
                    os.writeChars(data.email4.getType()); 
                    System.out.println(data.email1.getType());
                    // 5th email
                    os.writeChars(data.email5.getName());
                    System.out.println(data.email5.getName());
                    os.writeChars(data.email5.getPassword());
                    System.out.println(data.email5.getPassword());
                    os.writeChars(data.email5.getType()); 
                    System.out.println(data.email1.getType());
                }
                       
                
            }
            
            
            
            os.close();
        }
        catch(FileNotFoundException e){
            new pop_up("Error", "Cannot find the storage file", 0);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    

    
    close()
    {
        storeInFile();
        System.exit(0);
    }
}
