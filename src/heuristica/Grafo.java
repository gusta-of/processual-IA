package heuristica;

import java.util.ArrayList;
import java.util.Collections;
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
		origem.Arestas.add(new Aresta(origem, destino, custo));
		destino.Arestas.add(new Aresta(destino, origem, custo));
	}

	public void imprimaRotas() {
		for (Vertice vertice : cidades) {
			System.out.println("Nó pai " + vertice.Nome);
			for (Aresta aresta : vertice.Arestas) {
				System.out.println("    Nó filho: " + aresta.destino.Nome);
			}
		}
	}

//	BUSCA GULOSA
	public void buscaGulosa(Vertice origem) {

		caminho.add(origem);
		buscaGulosaRecursao(origem);
	}

	public List<Vertice> retornoCaminho() {
		return caminho;
	}

	private Vertice buscaGulosaRecursao(Vertice vertive) {

		if (vertive.Heiristica == 0)
			return vertive;

		Vertice vert = null;
		for (Aresta aresta : vertive.Arestas) {
			if (vert == null) {
				vert = aresta.destino;
				continue;
			}

			if (vert.Heiristica > aresta.destino.Heiristica) {
				vert = aresta.destino;
			}
		}

		caminho.add(vert);
		return buscaGulosaRecursao(vert);

	}

//	BUSCA A*

	private List<Vertice> aberta = new ArrayList<Vertice>();
	private List<Vertice> fechada = new ArrayList<Vertice>();
	private List<Vertice> auxiliar = new ArrayList<Vertice>();

	public List<Vertice> retornaCaminhoAestrela() {
		return fechada;
	}

	public void buscaAestrela(Vertice origem) {

		if (origem.isObjetivo()) {
			fechada.add(origem);
			return;
		} else {
			fechada.add(origem);
			origem.Arestas.forEach(a -> {
				aberta.add(a.destino);
			});
		}
		
		fechada.add(buscaAestrelaRecurcao(aberta));
	}

	private Vertice buscaAestrelaRecurcao(List<Vertice> vertices) {

		return null;
	}

	private int calculaHeiristicaTotal(Aresta aresta, Vertice vertice) {
		return aresta.custo + vertice.Heiristica;
	}

}
