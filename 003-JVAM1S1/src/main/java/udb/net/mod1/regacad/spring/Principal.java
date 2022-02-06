package udb.net.mod1.regacad.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	private static ApplicationContext cont;

	public static void main(String[] args) {

		cont = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		RegistroAcad r1 = cont.getBean(RegistroAcad.class);

		System.out.println("Registro ID: " + r1.getIdRegistro());
		System.out.println("Registro fecha: " + r1.getFechaRegistro());
		System.out.println("Estudiante: " + r1.getEstudiante().getNombre() + " " + r1.getEstudiante().getApellido());

	}

	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCuota: %.2f", e.getNombre(), e.getApellido(),
				e.getCum(), (e.getCuotaMensual() - e.calcularMontoBeca())));
		System.out.println("*****************************************************************");
	}

}
