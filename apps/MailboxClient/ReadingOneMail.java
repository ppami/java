package hackathon2.MailboxClient;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

public class ReadingOneMail {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		final String username = "pamicodeme@gmail.com";
		final String password = "testcodeme";
		System.out.println("Logging in...");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		System.out.println("Fetching messages...");
		Store store;
		try {
			//odebrane, oznacza jako odczytane
			store = session.getStore("pop3s");
			store.connect("pop.gmail.com", "pamicodeme@gmail.com", "testcodeme");
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);
			Message[] messages = emailFolder.getMessages();
			System.out.println("Number of messages: " + messages.length);
			for (int i = 0; i < messages.length; i++) {
				Message message = messages[i];
				System.out.println("No. " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
			}
			
			System.out.println("----------------------------");
			Scanner user = new Scanner(System.in);
			System.out.print("Choose the number of message to read: ");
			int numberOfMessage = user.nextInt();
			user.close();
			System.out.println();
			
			System.out.println("Reading message...");
			
			for (int i = 0; i < messages.length; i++) {
				if (i == numberOfMessage - 1) {
					System.out.println("No. " + (i + 1));
					System.out.println("Subject: " + messages[i].getSubject());
					System.out.println("From: " + messages[i].getFrom()[0]);
					System.out.println("Message: " + messages[i].getContent().toString());
				} else {
					break;
				}
			}
			
			emailFolder.close(false);
			store.close();
			
		} catch (MessagingException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
		
	}
	//part to interfejs z metodamy odczytujacymi rozne formaty wiadomosci
	public static void contentOfMessage(Part messageBody) {
		
	}

}
