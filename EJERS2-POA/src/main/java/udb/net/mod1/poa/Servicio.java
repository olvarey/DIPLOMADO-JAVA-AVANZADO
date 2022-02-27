package udb.net.mod1.poa;

import org.springframework.stereotype.Component;

@Component
public class Servicio {

	public void objUsuarioIT() {
		Usuario user1 = FactoriaUsuario.getInstance("IT");
		user1.setNombreCompleto("Melvin Oswaldo Reyes Pineda");
		user1.setContrasenia("123456");
		user1.setCorreo("melvin_reyes@cajamined.gob.sv");
		imprimirUsuario(user1);

	}

	public void objUsuarioComun() {
		Usuario user2 = FactoriaUsuario.getInstance("COMUN");
		user2.setNombreCompleto("Johanna Yamileth Michelle Bonilla Guevara");
		user2.setContrasenia("987654");
		user2.setCorreo("j.bonilla@isdemu.gob.sv");
		imprimirUsuario(user2);
	}

	public static void imprimirUsuario(Usuario u) {
		System.out.println(String.format("Nombre completo: %s \nContraseña: %s\nCorreo electrónico: %s",
				u.getNombreCompleto(), u.getContrasenia(), u.getCorreo()));
		System.out.println("-------------------------------------------------------------------------------");
	}

}
