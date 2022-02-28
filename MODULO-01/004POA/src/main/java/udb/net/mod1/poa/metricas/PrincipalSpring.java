package udb.net.mod1.poa.metricas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfigurandoSpring.class);
		Servicio servicio = contexto.getBean(Servicio.class);
		contexto.close();
		servicio.objEstudianteCep();
		servicio.objEstudianteColp();
	}

}
