package com.javaee.api.email_sender;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final String fromEmail = "kansaonp@gmail.com";
		final String password = "******"; /** INSERIR SENHA AQUI*/
		final String toEmail = "kansaonp@gmail.com"; 
		
		System.out.println("Initializing email send");
		
		EmailConfig config = new EmailConfig();		
		config.sendEmail(fromEmail, password, toEmail, "Aula", "Email Sender from Java");
    }
}
