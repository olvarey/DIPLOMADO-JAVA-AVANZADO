package udb.net.mod1.regacad;

public class EstudianteCep extends Estudiante {

	public EstudianteCep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteCep(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super(codigo, nombre, apellido, cum, cuotaMensual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMontoBeca() {
		// TODO Auto-generated method stub
		return getCum() >= 9 ? getCuotaMensual() * 0.90 : 0.00;
	}

}
