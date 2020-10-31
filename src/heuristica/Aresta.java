package heuristica;

public class Aresta {
	public int custo;
	public Vertice destino;
	
	public Aresta(Vertice destino) {
		this.destino = destino;
	}
	
	public Aresta(Vertice destino, int custo) {
		this.destino = destino;
		this.custo = custo;
	}
}
