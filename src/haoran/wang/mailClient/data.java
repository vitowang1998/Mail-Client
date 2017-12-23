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
    
    
    static void store(String name, String pass, String type, int index)
    {
        // first email
        if (index == 0)
        {
            data data1 = new data();
            data1.setName(name);
            data1.setPassword(pass);
            data1.setType(type);
            numOfEmail = 1;
            
            System.out.println(data1.getName());
            System.out.println(data1.getPassword());
            System.out.print(data1.getType());
            
        }
                // first email


    }
    
    
}