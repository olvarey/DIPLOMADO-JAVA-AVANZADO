package udb.net.mod1.poa.metricas;

import org.springframework.stereotype.Component;

import udb.net.mod1.poa.Estudiante;
import udb.net.mod1.poa.FactoriaEstudiante;

@Component
public class Servicio {
	public void metodo1() {
		try {
			Thread.currentThread();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Método 1");
	}

	public void metodo2() {
		System.out.println("Método 2");
	}

	public static void imprimir(Estudiante e) {
		System.out.println(String.format("Nombre: %s %s\nCum: %.2f\nCuota: %.2f", e.getNombre(), e.getApellido(),
				e.getCum(), (e.getCuotaMensual() - e.calcularMontoBeca())));
		System.out.println("*****************************************************************");
	}

	public void objEstudianteCep() {
		Estudiante e1 = FactoriaEstudiante.getInstance("CEP");
		e1.setCodigo(1);
		e1.setNombre("Melvin");
		e1.setApellido("Reyes");
		e1.setCum(8.45);
		e1.setCuotaMensual(67.00);
		imprimir(e1);
	}

	public void objEstudianteColp() {
		Estudiante e2 = FactoriaEstudiante.getInstance("COL");
		e2.setCodigo(2);
		e2.setNombre("Oswaldo");
		e2.setApellido("Pineda");
		e2.setCum(9.90);
		e2.setCuotaMensual(70.40);
		imprimir(e2);
	}
}
