package estrutura.dados;

public class Aresta {
	public int peso;
	public Vertice destino;
	
	public Aresta(Vertice destino, int peso) {
		this.destino = destino;
		this.peso = peso;
	}
}
