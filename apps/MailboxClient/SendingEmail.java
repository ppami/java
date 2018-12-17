package hackathon2.MailboxClient;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendingEmail {

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
		
		System.out.println("Preparing the message...");
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("pamicodeme@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("melerys@gmail.com"));
			message.setSubject("Test");
			message.setText("sth \n\n message");
			Transport.send(message);
			System.out.println("Message sent!");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	}

}
