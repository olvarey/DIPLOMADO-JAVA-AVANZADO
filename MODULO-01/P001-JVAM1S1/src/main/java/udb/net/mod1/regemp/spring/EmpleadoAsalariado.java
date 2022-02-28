package udb.net.mod1.regemp.spring;

public class EmpleadoAsalariado extends Empleado {

	public EmpleadoAsalariado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoAsalariado(Integer codigoEmpleado, String nombreCompleto, String apellidos, Double salario) {
		super(codigoEmpleado, nombreCompleto, apellidos, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPagoMensual() {
		// TODO Auto-generated method stub
		return (getSalario() - getSalario() * 0.20);
	}

}
