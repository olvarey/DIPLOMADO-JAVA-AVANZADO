package udb.net.mod1.regacad.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	private static ApplicationContext cont;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EstudianteCep e1 = new EstudianteCep(1, "Melvin", "Reyes", 8.45, 67.00);
		// EstudianteColp e2 = new EstudianteColp(2, "Oswaldo", "Pineda", 9.90, 70.40);

		cont = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		Estudiante e1 = cont.getBean(EstudianteCep.class);
		Estudiante e2 = cont.getBean(EstudianteColp.class);

		RegistroAcad r1 = cont.getBean(RegistroAcad.class);

		
		
		System.out.println("Registro ID: " + r1.getIdRegistro());
		System.out.println("Registro fecha: " + r1.getFechaRegistro());
		System.out.println("Estudiante: " + r1.getEstudiante().getNombre() + " " + r1.getEstudiante().getApellido());

//		e1.setCodigo(1);
//		e1.setNombre("Melvin");
//		e1.setApellido("Reyes");
//		e1.setCum(8.45);
//		e1.setCuotaMensual(67.00);
//
//		e2.setCodigo(2);
//		e2.setNombre("Oswaldo");
//		e2.setApellido("Pineda");
//		e2.setCum(9.90);
//		e2.setCuotaMensual(70.40);

//		imprimir(e1);
//		imprimir(e2);

	}

	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCuota: %.2f", e.getNombre(), e.getApellido(),
				e.getCum(), (e.getCuotaMensual() - e.calcularMontoBeca())));
		System.out.println("*****************************************************************");
	}

}
