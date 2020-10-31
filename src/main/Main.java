package main;

import ferramentas.Timer;
import problema.rotas.GrafoCidades;

public class Main {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		System.out.println("___________________________GRAFO_____________________________");
		GrafoCidades grafo = Heuristica();
//		grafo.imprimaRotas();
		
		System.out.println("####__________________________BUSCAS____________________________________#####");
		System.out.println("");
		System.out.println("______________________________Busca de Largura________________________________");
		
		Runtime runtimel = Runtime.getRuntime();
        runtimel.gc();
        
		GrafoCidades grafo1 = Heuristica();
		timer.iniciarContadorMiliSeconds();
		grafo1.buscaEmLargura(grafo1.Arad, grafo1.Bucareste);
		timer.finalize();
		
		long memoryl = runtimel.totalMemory() - runtimel.freeMemory();
		System.out.println("COMPLEXIDADE DE ESPAÇO: " + "bytes: " + memoryl + "  megabytes: "
                + bytesToMegabytes(memoryl));
		
		System.out.println("______________________________Busca de Profundidade________________________________");
		
		Runtime runtimep = Runtime.getRuntime();
        runtimep.gc();
        
		GrafoCidades grafo2 = Heuristica();
		timer.iniciarContadorMiliSeconds();
		grafo2.buscaEmProfundidade(grafo2.Arad, grafo2.Bucareste);
		timer.finalize();
		
		long memoryp = runtimep.totalMemory() - runtimep.freeMemory();
		System.out.println("COMPLEXIDADE DE ESPAÇO: " + "bytes: " + memoryp + "  megabytes: "
                + bytesToMegabytes(memoryp));
	
		System.out.println("______________________________Busca de Gulosa________________________________");
		
		Runtime runtimeg = Runtime.getRuntime();
        runtimeg.gc();
        
		timer.iniciarContadorMiliSeconds();
		grafo.buscaGulosa(grafo.Arad);
		System.out.println("CAMINHO ÓTIMO: " + grafo.retornoCaminho());
		timer.finalize();
		
		long memoryg = runtimep.totalMemory() - runtimeg.freeMemory();
		System.out.println("COMPLEXIDADE DE ESPAÇO: " + "bytes: " + memoryg + "  megabytes: "
                + bytesToMegabytes(memoryg));
//
		System.out.println("______________________________Busca de A*________________________________");
//		
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        
		timer.iniciarContadorMiliSeconds();
		grafo.buscaAestrela(grafo.Arad);
		System.out.println("CAMINHO ÓTIMO: " + grafo.retornaCaminhoAestrela());
		timer.finalize();
		
		long memory = runtime.totalMemory() - runtime.freeMemory();
		
		System.out.println("COMPLEXIDADE DE ESPAÇO: " + "bytes: " + memory + "  megabytes: "
                + bytesToMegabytes(memory));

	}
	
	private static final float MEGABYTE = 1024L * 1024L;

    public static float bytesToMegabytes(float bytes) {
    	float retorno = bytes / MEGABYTE;
        return retorno;
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
