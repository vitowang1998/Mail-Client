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


/**
 *
 * @author HaoranWang
 */
public class data 
{
    static int numOfEmail;
        
    // Instance Variables
    // Encapsulation
    private String userName;
    private String password;
    private String type;
    
    // Setters
    public void setName(String userName)
    {
        this.userName = userName;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    // Getters
    public String getName()
    {
        return this.userName;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public String getType()
    {
        return this.type;
    }   
   
    
    static data email1 = new data();
    static data email2 = new data();
    static data email3 = new data();
    static data email4 = new data();
    static data email5 = new data();
    

    // invoked by addGUI, store emails as objects
    static void store(String name, String pass, String type, int index)
    {
        // first email
        if (index == 0)
        {      
            email1.setName(name);
            email1.setPassword(pass);
            email1.setType(type);         
            numOfEmail = 1;    
        }
                
        // second email
        if (index == 1)
        {
            email2.setName(name);
            email2.setPassword(pass);
            email2.setType(type);
            numOfEmail = 2;            
        }

        // third email
        if (index == 2)
        {
            email3.setName(name);
            email3.setPassword(pass);
            email3.setType(type);
            numOfEmail = 3;            
        }

        // fourth email
        if (index == 3)
        {
            email4.setName(name);
            email4.setPassword(pass);
            email4.setType(type);
            numOfEmail = 4;            
        }

        // fifth email
        if (index == 4)
        {
            email5.setName(name);
            email5.setPassword(pass);
            email5.setType(type);
            numOfEmail = 5;            
        }
    }       
}