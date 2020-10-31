package heuristica;

import java.util.LinkedList;

public class Vertice {
	public String Nome;
	public LinkedList<Aresta> Arestas;
	public int Heiristica;
	private boolean visitado;
	
	public Vertice(String nome) {
		this.Nome = nome;
		this.Arestas = new LinkedList<Aresta>();
	}
	
	public Vertice(String nome, int heiristica) {
		this.Nome = nome;
		this.Arestas = new LinkedList<Aresta>();
		this.Heiristica = heiristica;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
	@Override
    public String toString() {
        return this.Nome;
    }
	
}
