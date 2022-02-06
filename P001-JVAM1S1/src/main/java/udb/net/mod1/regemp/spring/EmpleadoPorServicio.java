package udb.net.mod1.regemp.spring;

public class EmpleadoPorServicio extends Empleado {

	public EmpleadoPorServicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoPorServicio(Integer codigoEmpleado, String nombreCompleto, String apellidos, Double salario) {
		super(codigoEmpleado, nombreCompleto, apellidos, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPagoMensual() {
		// TODO Auto-generated method stub
		return (getSalario() - getSalario() * 0.10);
	}

}
