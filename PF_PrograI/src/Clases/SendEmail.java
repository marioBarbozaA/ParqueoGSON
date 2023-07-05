
package Clases;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    public static void send(String recipient, String subject, String body) {
        // Configuración del servidor SMTP y la información de autenticación
        String host = "smtp.gmail.com";
        int port = 587;
        String username = "salchichonparqueo@gmail.com";
        String password = "imnxvckoeueqxlqp";

        // Configuración de las propiedades del sistema
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);

        // Creación de la sesión de correo electrónico
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Creación del objeto de mensaje
            Message message = new MimeMessage(session);

            // Establecimiento de los detalles del remitente, destinatario, asunto y contenido
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(body);

            // Envío del correo electrónico
            Transport.send(message);

            System.out.println("El correo electrónico se envió correctamente.");
        } catch (MessagingException e) {
            System.out.println("Error al enviar el correo electrónico: " + e.getMessage());
        }
    }
}