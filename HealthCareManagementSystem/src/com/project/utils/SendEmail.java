package com.project.utils;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author bhavinbhatia
 */
public class SendEmail {

    private String user = "healthcarejava@gmail.com";
    private String pass = "bhatia123";

    public SendEmail(String recevier, String subject, String msg) {

        Properties props = new Properties();
        //setting the properties for sending the email. 
        props.put("mail.smtp.ssl.trust", "smtp.gamil.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.trust", "*");
        props.setProperty("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(user, pass);
            }
        });

        try {
// 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recevier));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);
            System.out.println("mail sent");

        } catch (MessagingException e) {
            System.out.println(e);
        }

    }

}
