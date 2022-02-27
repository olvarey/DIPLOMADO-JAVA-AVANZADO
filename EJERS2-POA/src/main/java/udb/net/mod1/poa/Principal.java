package udb.net.mod1.poa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurandoSpring.class);
		Servicio service = context.getBean(Servicio.class);
		context.close();
		service.objUsuarioIT();
		service.objUsuarioComun();
	}

}
