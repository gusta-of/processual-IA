package heuristica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vertice {
	public String Nome;
	public List<Aresta> Arestas;
	public int Heiristica;
	private boolean visitado = false;
	
	public Vertice(String nome) {
		this.Nome = nome;
		this.Arestas = new ArrayList<Aresta>();
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
	
	public boolean isObjetivo() {
		return this.Heiristica == 0;
	}
	
	@Override
    public String toString() {
        return this.Nome;
    }
	
}
