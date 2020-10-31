package heuristica;

import java.util.LinkedList;

public class Vertice {
	public String Nome;
	public LinkedList<Aresta> Arestas;
	public int Heiristica;
	
	public Vertice(String nome) {
		this.Nome = nome;
		this.Arestas = new LinkedList<Aresta>();
	}
	
	public Vertice(String nome, int heiristica) {
		this.Nome = nome;
		this.Arestas = new LinkedList<Aresta>();
		this.Heiristica = heiristica;
	}
	
}
