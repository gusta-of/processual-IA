package heuristica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

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
			System.out.println("NÓ pai " + vertice.Nome);
			for (Aresta aresta : vertice.Arestas) {
				System.out.println("    NÓ filho: " + aresta.destino.Nome);
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

	public List<Vertice> getCidades() {
		return this.cidades;
	}

	private Vertice buscaGulosaRecursao(Vertice vertive) {

		if (vertive.Heuristica == 0)
			return vertive;

		Vertice vert = null;
		for (Aresta aresta : vertive.Arestas) {
			if (vert == null) {
				vert = aresta.destino;
				continue;
			}

			if (vert.Heuristica > aresta.destino.Heuristica) {
				vert = aresta.destino;
			}
		}

		caminho.add(vert);
		return buscaGulosaRecursao(vert);

	}

//	BUSCA A*

	private List<Vertice> aberta = new ArrayList<Vertice>();
	private List<Vertice> fechada = new ArrayList<Vertice>();
	private Map<Vertice, Integer> mapa1;

	public List<Vertice> retornaCaminhoAestrela() {
		return fechada;
	}

	public void buscaAestrela(Vertice origem) {

		aberta.add(origem);

		origem.Arestas.forEach(n -> {
			aberta.add(n.destino);
		});

		buscaAestrelaRecurcao(aberta);
	}

	private void buscaAestrelaRecurcao(List<Vertice> vertices) {

		mapa1 = new HashMap<Vertice, Integer>();

		if (vertices.get(0).Heuristica == 0) {
			fechada.add(vertices.get(0));
			return;
		}

		vertices.get(0).Arestas.forEach(n -> {
			mapa1.put(n.destino, n.custo + n.destino.Heuristica);
		});

		Map<Vertice, Integer> mapaOrdenado = mapa1.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		fechada.add(aberta.get(0));
		aberta.clear();

		mapaOrdenado.forEach((key, value) -> {
			aberta.add(key);
		});

		buscaAestrelaRecurcao(aberta);
	}

	private ArrayList<Vertice> caminhoLargura = new ArrayList<Vertice>();
	private ArrayList<Vertice> aux = new ArrayList<Vertice>();

	public ArrayList<Vertice> buscaEmLargura(Vertice origem, Vertice destino) {
		aux.add(origem);
		buscaEmLarguraRecursao(aux, destino);
		return caminhoLargura;
	}

	public void buscaEmLarguraRecursao(ArrayList<Vertice> aux, Vertice destino) {
		if (aux.get(0).Nome.equals(destino.Nome)) {
			caminhoLargura.add(aux.get(0));
			System.out.println(caminhoLargura);
			return;
		}
		aux.get(0).Arestas.forEach(n -> {
			if (!n.destino.isVisitado()) {
				aux.add(n.destino);
			}
		});
		aux.get(0).setVisitado(true);
		caminhoLargura.add(aux.remove(0));
		System.out.println(caminhoLargura);
		buscaEmLarguraRecursao(aux, destino);
	}

	private Stack<Vertice> pilha = new Stack<Vertice>();
	private ArrayList<Vertice> caminhoProfundidade = new ArrayList<Vertice>();
	
	public void buscaEmProfundidade(Vertice origem, Vertice destino) {
		pilha.push(origem);
		buscaProfundidadeRecursiva(origem, destino);
		System.out.println("Destino: "+destino+" | Caminho: "+caminhoProfundidade);
	}
	
	
	public Stack<Vertice> buscaProfundidadeRecursiva(Vertice origem, Vertice buscado) {
		if (origem.Nome.equals(buscado.Nome)){
			return pilha;
		}
		origem.setVisitado(true);
		Vertice vAux = pilha.pop();
		caminhoProfundidade.add(vAux);
		vAux.Arestas.forEach(n -> {
			if(!n.destino.Nome.equals(vAux.Nome)){
				if(!n.destino.isVisitado()){
					pilha.push(n.destino);
				}
			}
		});
		return buscaProfundidadeRecursiva(vAux,buscado);
	}

}
