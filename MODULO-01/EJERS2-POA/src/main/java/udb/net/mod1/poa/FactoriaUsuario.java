package udb.net.mod1.poa;

public class FactoriaUsuario {
	public static Usuario getInstance(String type) {
		if (type.equals("IT")) {
			return new UsuarioIT();
		} else {
			return new UsuarioComun();
		}
	}
}
