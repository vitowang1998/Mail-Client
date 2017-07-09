package haoran.wang.mailClient;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;





public class sendEmail 
{
    
    private String userName = "software.testing.haoranwang@gmail.com";
    private String password = "GeorgesVanier";
    
    
    // Constructor
    sendEmail(String to, String subject, String message){
        
        
        // Properties for gmail account
        Properties prop = new Properties();
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");        
        
        
        // Create a new session 
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() 
        {
            // Create a package private method to do the password authentication so that we can 
            // reach our email account and send email out.
            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
            {
                return new javax.mail.PasswordAuthentication(userName, password);
            }
        });
        
        try
        {
            // Declare our email as a MimeMessage
            Message email = new MimeMessage(session);
            
            // Set
            email.setFrom(new InternetAddress("HaoranWang"));
            email.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            email.setSubject(subject);
            email.setText(message);
            
            
            Transport.send(email);
            
            System.out.println("Mail Sent");
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
