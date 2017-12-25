/*
 * ® Copyright 2017 Haoran Wang. All rights reserved.
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
    // directory of the binary file
    static final String path = "/Users/HaoranWang/Documents/GitHub/Mail Client/data/data.bin";
    
    final void rewrite()
    {
        try
        {
            FileOutputStream fileOS = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fileOS); 
            os.reset();
            System.out.println("successfully reset");
        }
        catch(FileNotFoundException e){
            new pop_up("Error", "Cannot find the storage file", 0);
        }catch(IOException e)
        {
            e.printStackTrace();
        }        
    }

    static final void storeNumber(int number)
    {
        try
        {
            FileOutputStream fileOS = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fileOS); 
            os.writeInt(number);
            System.out.println(number);
            System.out.println(data.numOfEmail);
        }
        catch(FileNotFoundException e){
            new pop_up("Error", "Cannot find the storage file", 0);
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
    
    static final void storeEmail(data d)
    {
        String path = "/Users/HaoranWang/Documents/GitHub/Mail Client/data/data.bin";
        try
        {
            FileOutputStream fileOS = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fileOS);            
            os.writeObject(d);
            System.out.println(d.getName());
            System.out.println(d.getPassword());
            System.out.println(d.getType());
            

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

        
        System.exit(0);
    }
}
