package problema.rotas;

import java.util.LinkedList;

import heuristica.Grafo;
import heuristica.Vertice;

public class GrafoCidades extends Grafo {
	
	
	public Vertice Arad = new Vertice("Arad", 366);
	public Vertice Bucareste = new Vertice("Bucareste", 0);
	public Vertice Craiova = new Vertice("Craiova", 160);
	public Vertice Drobeta = new Vertice("Drobeta", 242);
	public Vertice Eforie = new Vertice("Eforie", 161);
	public Vertice Fagaras = new Vertice("Fagaras", 178);
	public Vertice Giurgiu = new Vertice("Giurgiu", 77);
	public Vertice Hirsova = new Vertice("Hirsova", 151);
	public Vertice Iasi = new Vertice("Iasi", 226);
	public Vertice Lugoj= new Vertice("Lugoj", 244);
	public Vertice Mehadia= new Vertice("Mehadia", 241);
	public Vertice Neamt = new Vertice("Neamt", 234);
	public Vertice Oradea = new Vertice("Oradea", 380);
	public Vertice Pitesti = new Vertice("Pitesti", 98);
	public Vertice Rimnicu = new Vertice("Rimnicu Vilcea", 193);
	public Vertice Sibiu = new Vertice("Sibiu", 253);
	public Vertice Timisoara = new Vertice("Timisoara", 329);
	public Vertice Urziceni = new Vertice("Urziceni", 80);
	public Vertice Vaslui = new Vertice("Vaslui", 199);
	public Vertice Zerind = new Vertice("Zerind", 374);
	
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
