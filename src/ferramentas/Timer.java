package ferramentas;

import java.time.Duration;
import java.time.Instant;

public class Timer {
	private Instant inicio; 
	private Instant fim; 
	
	public void inicieContador() {
		inicio = Instant.now();
	}
	
	public String encerreContador() {
		fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		return duracao.getSeconds()+","+duracao.getNano();
	}
}
