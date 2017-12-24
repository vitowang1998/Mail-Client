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
        return userName;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getType()
    {
        return type;
    }   
   
    
    static String nameofEmail1;
    static String nameofEmail2;
    static String nameofEmail3;
    static String nameofEmail4;
    static String nameofEmail5;

    static void store(String name, String pass, String type, int index)
    {
        // first email
        if (index == 0)
        {
            data data1 = new data();
            data1.setName(name);
            data1.setPassword(pass);
            data1.setType(type);
            nameofEmail1 = data1.getName();
            numOfEmail = 1;    
        }
                
        // second email
        if (index == 1)
        {
            data data2 = new data();
            data2.setName(name);
            data2.setPassword(pass);
            data2.setType(type);
            nameofEmail2 = data2.getName();            
            numOfEmail = 2;            
        }

        // third email
        if (index == 2)
        {
            data data3 = new data();
            data3.setName(name);
            data3.setPassword(pass);
            data3.setType(type);
            nameofEmail3 = data3.getName();            
            numOfEmail = 3;            
        }

        // fourth email
        if (index == 3)
        {
            data data4 = new data();
            data4.setName(name);
            data4.setPassword(pass);
            data4.setType(type);
            nameofEmail4 = data4.getName();
            numOfEmail = 4;            
        }

        // fifth email
        if (index == 4)
        {
            data data5 = new data();
            data5.setName(name);
            data5.setPassword(pass);
            data5.setType(type);
            nameofEmail5 = data5.getName();
            numOfEmail = 5;            
        }
        
    }
    
        
}