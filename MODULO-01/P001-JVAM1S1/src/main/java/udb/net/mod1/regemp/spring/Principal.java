package udb.net.mod1.regemp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal {

	private static ApplicationContext cont;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "src/main/resources/applicationContext.xml";

		cont = new FileSystemXmlApplicationContext(path);

		EmpleadoAsalariado e1 = cont.getBean(EmpleadoAsalariado.class);
		EmpleadoPorServicio e2 = cont.getBean(EmpleadoPorServicio.class);
		EmpleadoComerciante e3 = cont.getBean(EmpleadoComerciante.class);

		e1.setCodigoEmpleado(1);
		e1.setNombreCompleto("Melvin Oswaldo Reyes Pineda");
		e1.setSalario(2000.00);

		e2.setCodigoEmpleado(2);
		e2.setNombreCompleto("Johanna Yamileth Michelle Bonilla Guevara");
		e2.setSalario(1700.00);

		e3.setCodigoEmpleado(3);
		e3.setNombreCompleto("Fathima Michelle Reyes Bonilla");
		e3.setSalario(3700.00);
		e3.setCostosMensuales(1500.00);

		imprimir(e1);
		imprimir(e2);
		imprimir(e3);

	}

	public static void imprimir(Empleado e) {
		System.out.println(String.format("Nombre completo: %s\nSalario: %.2f\nPago mensual: %.2f",
				e.getNombreCompleto(), e.getSalario(), e.calcularPagoMensual()));
		System.out.println("*****************************************************************");
	}

}
