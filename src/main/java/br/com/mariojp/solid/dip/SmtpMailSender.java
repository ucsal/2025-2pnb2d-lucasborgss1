package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender {

    private final SmtpClient smtpClient = new SmtpClient();

    @Override
    public void send(String to, String subject, String body) {
        smtpClient.send(to, subject, body);
    }
}
