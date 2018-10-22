package EmailOrder;

import EmailOrder.email.EmailFacade;//single import vs many imports without using fasade.

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade fasade=new EmailFacade();

		boolean result = fasade.sendOrderEmail(order);

		System.out.println("EmailOrder.Order Email "+ (result?"sent!":"NOT sent..."));
	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//				.withTemplate(template)
//				.withStationary(stationary)
//				.forObject(order)
//				.build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
	
}
