package nunes.luciano.services;

import org.springframework.mail.SimpleMailMessage;

import nunes.luciano.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
