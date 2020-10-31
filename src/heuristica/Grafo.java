package heuristica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Grafo {

	protected LinkedList<Vertice> cidades;
	private List<Vertice> caminho;
	
	public Grafo() {
		this.cidades = new LinkedList<Vertice>();
		this.caminho = new ArrayList<Vertice>();
	}

	public void adicioneRota(Vertice origem, Vertice destino, int custo) {
		origem.Arestas.add(new Aresta(destino, custo));
		destino.Arestas.add(new Aresta(origem, custo));
	}

	public void imprimaRotas() {
		for (Vertice vertice : cidades) {
			System.out.println("Nó pai " + vertice.Nome);
			for (Aresta aresta : vertice.Arestas) {
				System.out.println("    Nó filho: " + aresta.destino.Nome);
			}
		}
	}

	public void buscaGulosa(String origem) {
		
		Vertice v_origem = getVertice(origem);
		caminho.add(v_origem);
		buscaGulosa(v_origem);
	}
	
	public List<Vertice> retornoCaminho() {
		return caminho;
	}
	
	private Vertice buscaGulosa(Vertice vertive) {
		
		if (vertive.Heiristica == 0)
			return vertive;
		
		Vertice vert = null;
		for(Aresta aresta: vertive.Arestas) {
			if (vert == null) { 
				vert = aresta.destino;
				continue;
			}
			
			if (vert.Heiristica > aresta.destino.Heiristica) {
				vert = aresta.destino;
			}
		}
		
		caminho.add(vert);
		return buscaGulosa(vert);
		
	}

	private Vertice getVertice(String nome) {

		for (Vertice vertice : cidades) {
			
			if (nome == vertice.Nome) {
				return vertice;
			}
		}
		
		return null;
	}

}
