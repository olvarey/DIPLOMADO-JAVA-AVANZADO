package udb.net.mod1.regemp.spring;

public class EmpleadoComerciante extends Empleado {

	public Double costosMensuales;

	public EmpleadoComerciante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoComerciante(Integer codigoEmpleado, String nombreCompleto, String apellidos, Double salario) {
		super(codigoEmpleado, nombreCompleto, apellidos, salario);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoComerciante(Integer codigoEmpleado, String nombreCompleto, String apellidos, Double salario,
			Double costosMensuales) {
		super(codigoEmpleado, nombreCompleto, apellidos, salario);
		this.costosMensuales = costosMensuales;
	}

	public Double getCostosMensuales() {
		return costosMensuales;
	}

	public void setCostosMensuales(Double costosMensuales) {
		this.costosMensuales = costosMensuales;
	}

	@Override
	public Double calcularPagoMensual() {
		// TODO Auto-generated method stub
		return (getSalario() - getCostosMensuales());
	}

}
