package estrutura.dados;

import java.util.LinkedList;

public class Vertice {
	public String Nome;
	public LinkedList<Aresta> Arestas;
	
	public Vertice(String nome) {
		this.Nome = nome;
		this.Arestas = new LinkedList<Aresta>();
	}
}
