package udb.net.mod1.poa.metricas;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoLog {
	@Around(value = "execution(* udb.net.mod1.poa.metricas.*.*())")
	public void tiempoPasado(ProceedingJoinPoint punto) throws Throwable {
		// Inicio primer método
		Long tiempo1 = System.currentTimeMillis();
		punto.proceed();
		// Inicio segundo método
		Long tiempo2 = System.currentTimeMillis();
		Long total = tiempo2 - tiempo1;
		if (total > 2000)
			System.out.format("El método es: %s y el tiempo transcurrido %d\n", punto.getSignature().getName(), total);
	}

	@Before(value = "execution(* objEstudianteCep())")
	public void imprimirCep() {
		System.out.println("Estudiante con mayor monto en beca");
	}
}
