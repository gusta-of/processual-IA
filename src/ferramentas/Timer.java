package ferramentas;

import java.time.Duration;
import java.time.Instant;

public class Timer {
	private Instant inicio;
	private Instant fim;
	
	private long inicioMili;
	private long fimMili;
	
	public void inicieContador() {
		inicio = Instant.now();
	}
	
	public void encerreContador() {
		fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("Tempo de execução: " + duracao.getNano());
	}
	
	public void iniciarContadorMiliSeconds() {
		inicioMili = System.currentTimeMillis();
	}
	
	public void finalize() {
		
		fimMili = System.currentTimeMillis() - inicioMili;
		System.out.println("DEMOROU:: " + fimMili + "ms");
	}
}
