package main;

import java.util.ArrayList;

// import arvore.Arvore;
import grafo.Aresta;
import grafo.Grafo;
import grafo.Vertice;
import problema.rotas.GrafoCidades;

public class Main {

	public static void main(String[] args) {
		
		// Arvore arvore = new Arvore(500, "raiz");
		
		// arvore.Inserir(1, "no 1");
		// arvore.Inserir(35, "no 35");
		// arvore.Inserir(3, "no 3");
		// arvore.Inserir(44, "no 44");
		// arvore.Inserir(10, "no 10");
		// arvore.Inserir(6, "no 6");
		// arvore.Inserir(450, "no 450");
		
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

        rotas.imprimaRotas();
		
        
	}
	
	// public static void grafos() {
	// 	Vertice arad = new Vertice("1");
    //     Vertice no2 = new Vertice("2",no1);
    //     Vertice no3 = new Vertice("3",no1);
    //     Vertice no4 = new Vertice("4",no2);
    //     Vertice no5 = new Vertice("5",no2);
    //     Vertice no6 = new Vertice("6",no3);
    //     Vertice no7 = new Vertice("7",no4);
    //     // no1.setVizinhos(no2);
    //     Aresta a1 = new Aresta(1 , no1, no2);
    //     Aresta a2 = new Aresta(1 , no1, no3);
    //     Aresta a3 = new Aresta(1 , no2, no4);
    //     Aresta a4 = new Aresta(1 , no2, no5);
    //     Aresta a5 = new Aresta(1 , no3, no6);
    //     Aresta a6 = new Aresta(1 , no4, no7);
    //     // no1.addIncidentes(a1);

    //     Grafo g1 = new Grafo();

    //     ArrayList <Vertice> nos = new ArrayList<Vertice>();
    //     nos.add(no1);
    //     nos.add(no2);
    //     nos.add(no3);
    //     nos.add(no4);
    //     nos.add(no5);
    //     nos.add(no6);
    //     nos.add(no7);

    //     g1.setVertices(nos);

    //     ArrayList <Aresta> arestas = new ArrayList<>();
    //     arestas.add(a1);
    //     arestas.add(a2);
    //     arestas.add(a3);
    //     arestas.add(a4);
    //     arestas.add(a5);
    //     arestas.add(a6);

    //     g1.setArestas(arestas);

    //     // System.out.println(no1.getPai().getNome());
    //     // System.out.println(no1.getFilhos());
    //     // System.out.println(no2.getPai().getNome());
    //     // System.out.println(no2.getFilhos());
    //     // System.out.println(no3.getPai().getNome());
    //     // System.out.println(no3.getFilhos());
    //     // System.out.println(no4.getPai().getNome());
    //     // System.out.println(no4.getFilhos());
    //     System.out.println("arvore completa");
    //     g1.imprimeArvore();
    //     // System.out.println("busca em largura");
    //     // System.out.println(g1.buscaEmLargura("1", "2"));
    //     // System.out.println("busca em profundidade");
    //     // System.out.println(g1.buscaEmProfundidade("1", "7"));
          
    // }
    
    // public static void buscaEmProfundidadePROBLEMA() {
        

        // Aresta a1 = new Aresta(1 , no1, no2);
        // Aresta a2 = new Aresta(1 , no1, no3);
        // Aresta a3 = new Aresta(1 , no2, no4);
        // Aresta a4 = new Aresta(1 , no2, no5);
        // Aresta a5 = new Aresta(1 , no3, no6);
        // Aresta a6 = new Aresta(1 , no4, no7);
        // // no1.addIncidentes(a1);

        // Grafo g1 = new Grafo();

        // ArrayList <Vertice> nos = new ArrayList<Vertice>();
        // nos.add(no1);
        // nos.add(no2);
        // nos.add(no3);
        // nos.add(no4);
        // nos.add(no5);
        // nos.add(no6);
        // nos.add(no7);

        // g1.setVertices(nos);

        // ArrayList <Aresta> arestas = new ArrayList<>();
        // arestas.add(a1);
        // arestas.add(a2);
        // arestas.add(a3);
        // arestas.add(a4);
        // arestas.add(a5);
        // arestas.add(a6);

        // g1.setArestas(arestas);

        // System.out.println("arvore completa");
        // g1.imprimeArvore();
        // System.out.println("busca em largura");
        // System.out.println(g1.buscaEmLargura("1", "2"));
    // }

    public static Grafo Problema() {
        // Vertices
        Vertice arad = new Vertice("Arad");
        Vertice timisoara = new Vertice("Timisoara");
        Vertice sibiu = new Vertice("Sibiu");
        Vertice zerind = new Vertice("Zerind");
        Vertice lugoj = new Vertice("Lugoj");
        Vertice mehadia = new Vertice("Mehadia");
        Vertice drobeta = new Vertice("Drobeta");
        Vertice craiova = new Vertice("Craiova");
        Vertice fagaras = new Vertice("Fagaras");
        Vertice rimnicu = new Vertice("Rimnicu Vilcea");
        Vertice pitesti = new Vertice("Pitesti");
        Vertice buscareste = new Vertice("Bucareste");
        Vertice giurgiu = new Vertice("Giurgiu");
        Vertice uziceni = new Vertice("Urziceni");
        Vertice hirsova = new Vertice("Hirsova");
        Vertice eforie = new Vertice("Eforie");
        Vertice vaslui = new Vertice("Vaslui");
        Vertice iasi = new Vertice("Iasi");
        Vertice neamt = new Vertice("Neamt");
        Vertice oradea = new Vertice("Oradea");

        // Arestas
        // arad -> Sibiu
        Aresta a1 = new Aresta(1 , arad, sibiu);
        // arad -> timisoara
        Aresta a2 = new Aresta(1 , arad, timisoara);
        // arad -> Zerind
        Aresta a3 = new Aresta(1 , arad, zerind);
        // timisoara -> lugoj
        Aresta a4 = new Aresta(1 , timisoara, lugoj);
        // Logoj -> Mehadia
        Aresta a5 = new Aresta(1 , lugoj, mehadia);
        // Mehadia -> Drobeta
        Aresta a6 = new Aresta(1 , mehadia, drobeta);
        // Drobeta -> Craiova   
        Aresta a7 = new Aresta(1 , drobeta, craiova);
        // Zerind -> Oradea
        Aresta a8 = new Aresta(1 , zerind, oradea);
        // Oradea -> Sibiu
        Aresta a9 = new Aresta(1 , oradea, sibiu);
        // Rimnicu Vilcea -> Pitesti
        Aresta a10 = new Aresta(1 , rimnicu, pitesti);
        // Rimnicu Vilcea -> Craiova
        Aresta a11 = new Aresta(1 , rimnicu, craiova);
        //Craiova -> Pitesti 
        Aresta a12 = new Aresta(1 , craiova, pitesti);
        // Sibiu -> Fagaras
        Aresta a13 = new Aresta(1 , sibiu, fagaras);
        // Sibiu -> Rimnicu Vilcea
        Aresta a14 = new Aresta(1 , sibiu, rimnicu);
        // Fagaras - > Bucareste
        Aresta a15 = new Aresta(1 , fagaras, buscareste);
        // Pitesti -> Bucareste
        Aresta a16 = new Aresta(1 , pitesti, buscareste);
        // Bucareste -> Giurgiu
        Aresta a17 = new Aresta(1 , buscareste, giurgiu);
        // Bucareste -> Urzeceni 
        Aresta a18 = new Aresta(1 , buscareste, uziceni);
        // Urzeceni -> Hirsova
        Aresta a19 = new Aresta(1 , uziceni, hirsova);
        // Hirsova -> Eforie
        Aresta a20 = new Aresta(1 , hirsova, eforie);
        // Urzeceni -> Vaslui
        Aresta a21 = new Aresta(1 , uziceni, vaslui);
        // Vaslui -> Iasi
        Aresta a22 = new Aresta(1 , vaslui, iasi);
        // Iasi -> Neamt
        Aresta a23 = new Aresta(1 , iasi, neamt);

        
        ArrayList <Vertice> vertices = new ArrayList<Vertice>();
        vertices.add(arad);
        vertices.add(timisoara);
        vertices.add(sibiu);
        vertices.add(zerind);
        vertices.add(lugoj);
        vertices.add(mehadia);
        vertices.add(drobeta);
        vertices.add(craiova);
        vertices.add(fagaras);
        vertices.add(rimnicu);
        vertices.add(pitesti);
        vertices.add(buscareste);
        vertices.add(giurgiu);
        vertices.add(uziceni);
        vertices.add(hirsova);
        vertices.add(eforie);
        vertices.add(vaslui);
        vertices.add(iasi);
        vertices.add(neamt);
        vertices.add(oradea);

        ArrayList <Aresta> arestas = new ArrayList<>();
        arestas.add(a1);
        arestas.add(a2);
        arestas.add(a3);
        arestas.add(a4);
        arestas.add(a5);
        arestas.add(a6);
        arestas.add(a7);
        arestas.add(a8);
        arestas.add(a9);
        arestas.add(a10);
        arestas.add(a11);
        arestas.add(a12);
        arestas.add(a13);
        arestas.add(a14);
        arestas.add(a15);
        arestas.add(a16);
        arestas.add(a17);
        arestas.add(a18);
        arestas.add(a19);
        arestas.add(a20);
        arestas.add(a21);
        arestas.add(a22);
        arestas.add(a23);

        // System.out.println(arestas);
        Grafo g1 = new Grafo();
        g1.setArestas(arestas);
        // g1.setVertices(vertices);
                // System.out.println(grafo.getArestas());
        // System.out.println(g1.posicaoVertice("Arad"));
        // System.out.println(g1.posicaoVertice("Sibiu"));
        // System.out.println(g1.posicaoVertice("Fagaras"));
        System.out.println();
        System.out.println("busca em profundidade");
        System.out.println(g1.buscaEmProfundidade("Arad", "Bucareste"));
        System.out.println();
        System.out.println("busca em largura");
        System.out.println(g1.buscaEmLargura("Arad", "Bucareste"));
        return g1;
    }


}
