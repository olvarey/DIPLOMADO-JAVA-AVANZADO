package udb.net.mod1.poa;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoUsuario {
	@Before(value = "execution(* objUsuarioIT())")
	public void imprimirUsuarioIT() {
		System.out.println("Usuario IT ingreso al sistema.");
	}
}
