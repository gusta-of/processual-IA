package problema.rotas;

import java.util.LinkedList;

import estrutura.dados.Grafo;
import estrutura.dados.Vertice;

public class GrafoCidades extends Grafo {
	
	public Vertice Oradea = new Vertice("Oradea");
	public Vertice Zerind = new Vertice("Zerind");
	public Vertice Arad = new Vertice("Arad");
	public Vertice Timisoara = new Vertice("Timisoara");
	public Vertice Lugoj= new Vertice("Lugoj");
	public Vertice Mehadia= new Vertice("Mehadia");
	public Vertice Drobeta = new Vertice("Drobeta");
	public Vertice Sibiu = new Vertice("Sibiu");
	public Vertice Rimnicu = new Vertice("Rimnicu");
	public Vertice Craiova = new Vertice("Craiova");
	public Vertice Fagaras = new Vertice("Fagaras");
	public Vertice Pitesti = new Vertice("Pitesti");
	public Vertice Bucareste = new Vertice("Bucareste");
	public Vertice Giurgiu = new Vertice("Giurgiu");
	public Vertice Neamt = new Vertice("Neamt");
	public Vertice Iasi = new Vertice("Iasi");
	public Vertice Vaslui = new Vertice("Vaslui");
	public Vertice Urziceni = new Vertice("Urziceni");
	public Vertice Hirsova = new Vertice("Hirsova");
	public Vertice Eforie = new Vertice("Eforie");
	
	public GrafoCidades() {
		super();
		cidades = new LinkedList<Vertice>();
		
		cidades.add(Oradea);
		cidades.add(Zerind);
		cidades.add(Arad);
		cidades.add(Timisoara);
		cidades.add(Lugoj);
		cidades.add(Mehadia);
		cidades.add(Drobeta);
		cidades.add(Sibiu);
		cidades.add(Rimnicu);
		cidades.add(Craiova);
		cidades.add(Fagaras);
		cidades.add(Pitesti);
		cidades.add(Bucareste);
		cidades.add(Giurgiu);
		cidades.add(Neamt);
		cidades.add(Iasi);
		cidades.add(Vaslui);
		cidades.add(Urziceni);
		cidades.add(Hirsova);
		cidades.add(Eforie);
	}
}
