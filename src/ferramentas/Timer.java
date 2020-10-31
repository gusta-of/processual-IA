package ferramentas;

import java.time.Duration;
import java.time.Instant;

public class Timer {
	private Instant inicio;
	private Instant fim;
	
	public void inicieContador() {
		inicio = Instant.now();
	}
	
	public void encerreContador() {
		fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("Tempo de execução: "+duracao.getSeconds()+","+duracao.getNano());
	}
}
