package udb.net.mod1.regemp.spring;

public abstract class Empleado {

	private Integer codigoEmpleado;
	private String nombreCompleto;
	private Double salario;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(Integer codigoEmpleado, String nombreCompleto, String apellidos, Double salario) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.nombreCompleto = nombreCompleto;

		this.salario = salario;
	}

	public abstract Double calcularPagoMensual();

	public Integer getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
