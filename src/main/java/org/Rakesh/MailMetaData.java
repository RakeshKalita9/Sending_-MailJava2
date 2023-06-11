package org.Rakesh;

import javax.mail.Address;

public class MailMetaData {
    public static  final String hostServer = "smtp.gmail.com";
    public static final String port ="465";
    public static final String sslProp = "mail.smtp.ssl.enable";
    public static final String authProp ="mail.smtp.auth";

    public static String senderEmail ;

    public static String senderPassword;

    public static Address[] resAddresses;

}
