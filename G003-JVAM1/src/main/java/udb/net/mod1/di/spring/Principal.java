package udb.net.mod1.di.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	private static ApplicationContext cont;

	public static void main(String[] args) {

		cont = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		Cliente cliente = cont.getBean(Cliente.class);
		System.out.println("Cliente: " + cliente.getNombre());
		System.out.println("Monto total: " + cliente.getFactura().getMonto());
		System.out.println("**************************************************");

		for (DetalleFactura d : cliente.getFactura().getDetalleFacturaList()) {
			System.out.println("" + d.getConcepto());
			System.out.println("" + d.getCantidad());
			System.out.println("" + d.getMontoUnitario());
			System.out.println("**************************************************");
		}
	}
}
