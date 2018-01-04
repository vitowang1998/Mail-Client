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

import javax.swing.JOptionPane;

/**
 *
 * @author HaoranWang
 */
public class pop_up
{
    // Constructor
    pop_up(String titleBar, String infoMessage, int type)
    {
        // This function will create a new pop-up window.
        // The last parameter for showMessageDialog function is the message type
        // 0 ERROR
        // 1 INFORMATION
        // 2 WARNING
        // 3 QUESTION
        // 4 PLAIN
        
        // Display an information dialogue
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, type);
    }
    
}
