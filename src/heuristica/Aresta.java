package heuristica;

public class Aresta {
	public int custo;
	public Vertice destino;
	public Vertice origem;
	
	public Aresta(Vertice destino) {
		this.destino = destino;
	}
	
	public Aresta(Vertice destino, int custo) {
		this.destino = destino;
		this.custo = custo;
	}
	
	public Aresta(Vertice origem, Vertice destino, int custo) {
		this.origem = origem;
		this.destino = destino;
		this.custo = custo;
	}
}
