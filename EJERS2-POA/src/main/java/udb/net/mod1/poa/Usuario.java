package udb.net.mod1.poa;

public abstract class Usuario {
	private String nombreCompleto;
	private String contrasenia;
	private String correo;

	public Usuario() {
		super();
	}

	public Usuario(String nombreCompleto, String contrasenia, String correo) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.contrasenia = contrasenia;
		this.correo = correo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
