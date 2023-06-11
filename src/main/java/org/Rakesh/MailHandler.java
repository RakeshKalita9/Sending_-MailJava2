package org.Rakesh;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {
    public void sendMail() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host",MailMetaData.hostServer);
        properties.put("mail.smtp.port",MailMetaData.port);
        properties.put(MailMetaData.sslProp,true);
        properties.put(MailMetaData.authProp,true);
        Authenticator authenticator = new CustomAuthentication();
        Session session = Session.getInstance(properties,authenticator);
        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(MailMetaData.senderEmail);
            message.setSubject(ComposeEmail.mailSubject);
            message.setText(ComposeEmail.mailBody);
            message.setRecipients(Message.RecipientType.TO, MailMetaData.resAddresses);
            Transport.send(message);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }


}
