package email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Main {
	public static void main(String[] args) throws Exception  {
	
		new Email("xxxxyyyy@gmail.com").start();
		Thread.sleep(10);
		new Email("yyyyxxxx@gmail.com").start();
		Thread.sleep(10);
		new Email("zzzzpppp@gmail.com").start();
		
	}}

