package org.Rakesh;


import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sender Email");
        MailMetaData.senderEmail = sc.next();
        System.out.println("Enter Sender Password");
        MailMetaData.senderPassword = sc.next();
        try {
            System.out.println("Enter the Receiver count");
            int n = sc.nextInt();
            Address [] addresses = new Address[n];
            System.out.println("Enter the array of Receiver");
            for(int i=0;i<n;i++) {
                addresses[i] = new InternetAddress(sc.next());
            }
            System.out.println("provide Subject of the mail.....................");
            ComposeEmail.mailSubject = sc.next();
            sc.nextLine();
            System.out.println("provide Body of the mail...........");
            ComposeEmail.mailBody =sc.nextLine();

            MailMetaData.resAddresses = addresses;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        MailHandler mailHandler = new MailHandler();
        System.out.println("Sending..................................");
        mailHandler.sendMail();
        System.out.println("Mail is Sent...");

    }
}