package main;

import problema.rotas.GrafoCidades;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("___________________________GRAFO_____________________________");
		GrafoCidades grafo = Heuristica();
		grafo.imprimaRotas();
		
		System.out.println("####__________________________BUSCAS____________________________________#####");
		System.out.println("");
		System.out.println("______________________________Busca de Largura________________________________");
		GrafoCidades grafo1 = Heuristica();
		grafo1.buscaEmLargura(grafo1.Arad, grafo1.Bucareste);

		System.out.println("______________________________Busca de Profundidade________________________________");
		GrafoCidades grafo2 = Heuristica();
		grafo2.buscaEmProfundidade(grafo2.Arad, grafo2.Bucareste);
		
		System.out.println("______________________________Busca de Gulosa________________________________");
		grafo.buscaGulosa(grafo.Arad);
		System.out.println("CAMINHO ÓTIMO: " + grafo.retornoCaminho());

		System.out.println("______________________________Busca de A*________________________________");
		grafo.buscaAestrela(grafo.Arad);
		System.out.println("CAMINHO ÓTIMO: " + grafo.retornaCaminhoAestrela());

	}

	public static GrafoCidades Heuristica() {
		GrafoCidades rotas = new GrafoCidades();

		rotas.adicioneRota(rotas.Arad, rotas.Zerind, 75);
		rotas.adicioneRota(rotas.Arad, rotas.Sibiu, 140);
		rotas.adicioneRota(rotas.Arad, rotas.Timisoara, 118);

		rotas.adicioneRota(rotas.Zerind, rotas.Oradea, 71);

		rotas.adicioneRota(rotas.Oradea, rotas.Sibiu, 151);

		rotas.adicioneRota(rotas.Timisoara, rotas.Lugoj, 111);

		rotas.adicioneRota(rotas.Lugoj, rotas.Mehadia, 70);

		rotas.adicioneRota(rotas.Mehadia, rotas.Drobeta, 70);

		rotas.adicioneRota(rotas.Drobeta, rotas.Craiova, 120);

		rotas.adicioneRota(rotas.Sibiu, rotas.Fagaras, 99);
		rotas.adicioneRota(rotas.Sibiu, rotas.Rimnicu, 80);

		rotas.adicioneRota(rotas.Rimnicu, rotas.Pitesti, 97);
		rotas.adicioneRota(rotas.Rimnicu, rotas.Craiova, 146);

		rotas.adicioneRota(rotas.Craiova, rotas.Pitesti, 138);

		rotas.adicioneRota(rotas.Fagaras, rotas.Bucareste, 211);

		rotas.adicioneRota(rotas.Pitesti, rotas.Bucareste, 101);

		rotas.adicioneRota(rotas.Bucareste, rotas.Giurgiu, 90);
		rotas.adicioneRota(rotas.Bucareste, rotas.Urziceni, 85);

		rotas.adicioneRota(rotas.Urziceni, rotas.Hirsova, 98);
		rotas.adicioneRota(rotas.Urziceni, rotas.Vaslui, 142);

		rotas.adicioneRota(rotas.Vaslui, rotas.Iasi, 92);

		rotas.adicioneRota(rotas.Iasi, rotas.Neamt, 87);

		rotas.adicioneRota(rotas.Hirsova, rotas.Eforie, 86);

		return rotas;
	}

}
