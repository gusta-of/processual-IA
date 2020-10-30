package main;

import java.util.ArrayList;

// import arvore.Arvore;
import grafo.Aresta;
import grafo.Grafo;
import grafo.Vertice;

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
		
        // Problema();
        // grafo.imprimeArvore();
        // System.out.println(grafo.getVertice("Arad").getIncidentes());
        // System.out.println(grafo.getVertice("Arad").getFilhos());
        // System.out.println(grafo.getVertice("Arad").getVizinhos());
        // System.out.println(grafo.getArestas());
        // System.out.println(grafo.buscaEmProfundidade("Arad", "Bucareste"));
	}
	public static void grafos() {
		Vertice no1 = new Vertice("1");
        Vertice no2 = new Vertice("2",no1);
        Vertice no3 = new Vertice("3",no1);
        Vertice no4 = new Vertice("4",no2);
        Vertice no5 = new Vertice("5",no2);
        Vertice no6 = new Vertice("6",no3);
        Vertice no7 = new Vertice("7",no4);
        // no1.setVizinhos(no2);
        Aresta a1 = new Aresta(1 , no1, no2);
        Aresta a2 = new Aresta(1 , no1, no3);
        Aresta a3 = new Aresta(1 , no2, no4);
        Aresta a4 = new Aresta(1 , no2, no5);
        Aresta a5 = new Aresta(1 , no3, no6);
        Aresta a6 = new Aresta(1 , no4, no7);
        // no1.addIncidentes(a1);

        Grafo g1 = new Grafo();

        ArrayList <Vertice> nos = new ArrayList<Vertice>();
        nos.add(no1);
        nos.add(no2);
        nos.add(no3);
        nos.add(no4);
        nos.add(no5);
        nos.add(no6);
        nos.add(no7);

        g1.setVertices(nos);

        ArrayList <Aresta> arestas = new ArrayList<>();
        arestas.add(a1);
        arestas.add(a2);
        arestas.add(a3);
        arestas.add(a4);
        arestas.add(a5);
        arestas.add(a6);

        g1.setArestas(arestas);

        // System.out.println(no1.getPai().getNome());
        // System.out.println(no1.getFilhos());
        // System.out.println(no2.getPai().getNome());
        // System.out.println(no2.getFilhos());
        // System.out.println(no3.getPai().getNome());
        // System.out.println(no3.getFilhos());
        // System.out.println(no4.getPai().getNome());
        // System.out.println(no4.getFilhos());
        System.out.println("arvore completa");
        g1.imprimeArvore();
        // System.out.println("busca em largura");
        // System.out.println(g1.buscaEmLargura("1", "2"));
        // System.out.println("busca em profundidade");
        // System.out.println(g1.buscaEmProfundidade("1", "7"));
          
    }
    
    public static void buscaEmProfundidadePROBLEMA() {
        

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
    }

    public static Grafo Problema() {
        // Vertices
        Vertice no1 = new Vertice("Arad");
        Vertice no2 = new Vertice("Timisoara");
        Vertice no3 = new Vertice("Sibiu");
        Vertice no4 = new Vertice("Zerind");
        Vertice no5 = new Vertice("Lugoj");
        Vertice no6 = new Vertice("Mehadia");
        Vertice no7 = new Vertice("Drobeta");
        Vertice no8 = new Vertice("Craiova");
        Vertice no9 = new Vertice("Fagaras");
        Vertice no10 = new Vertice("Rimnicu Vilcea");
        Vertice no11 = new Vertice("Pitesti");
        Vertice no12 = new Vertice("Bucareste");
        Vertice no13 = new Vertice("Giurgiu");
        Vertice no14 = new Vertice("Urziceni");
        Vertice no15 = new Vertice("Hirsova");
        Vertice no16 = new Vertice("Eforie");
        Vertice no17 = new Vertice("Vaslui");
        Vertice no18 = new Vertice("Iasi");
        Vertice no19 = new Vertice("Neamt");
        Vertice no20 = new Vertice("Oradea");
        // Arestas
        // arad -> timisoara
        Aresta a1 = new Aresta(1 , no1, no2);
        // arad -> Sibiu
        Aresta a2 = new Aresta(1 , no1, no3);
        // arad -> Zerind
        Aresta a3 = new Aresta(1 , no1, no4);
        // timisoara -> lugoj
        Aresta a4 = new Aresta(1 , no2, no5);
        // Logoj -> Mehadia
        Aresta a5 = new Aresta(1 , no5, no6);
        // Mehadia -> Drobeta
        Aresta a6 = new Aresta(1 , no6, no7);
        // Drobeta -> Craiova   
        Aresta a7 = new Aresta(1 , no7, no8);
        // Zerind -> Oradea
        Aresta a8 = new Aresta(1 , no4, no20);
        // Oradea -> Sibiu
        Aresta a9 = new Aresta(1 , no20, no3);
        // Sibiu -> Rimnicu Vilcea
        Aresta a10 = new Aresta(1 , no3, no10);
        // Rimnicu Vilcea -> Pitesti
        Aresta a11 = new Aresta(1 , no10, no11);
        // Rimnicu Vilcea -> Craiova
        Aresta a12 = new Aresta(1 , no10, no8);
        //Craiova -> Pitesti 
        Aresta a13 = new Aresta(1 , no8, no11);
        // Sibiu -> Fagaras
        Aresta a14 = new Aresta(1 , no3, no9);
        // Fagaras - > Bucareste
        Aresta a15 = new Aresta(1 , no9, no12);
       
        // Pitesti -> Bucareste
        Aresta a16 = new Aresta(1 , no11, no12);
        // Bucareste -> Giurgiu
        Aresta a17 = new Aresta(1 , no12, no13);
        // Bucareste -> Urzeceni 
        Aresta a18 = new Aresta(1 , no12, no14);
        // Urzeceni -> Hirsova
        Aresta a19 = new Aresta(1 , no14, no15);
        // Hirsova -> Eforie
        Aresta a20 = new Aresta(1 , no15, no16);
        // Urzeceni -> Vaslui
        Aresta a21 = new Aresta(1 , no14, no17);
        // Vaslui -> Iasi
        Aresta a22 = new Aresta(1 , no17, no18);
        // Iasi -> Neamt
        Aresta a23 = new Aresta(1 , no18, no19);




        ArrayList <Vertice> vertices = new ArrayList<Vertice>();
        vertices.add(no1);
        vertices.add(no2);
        vertices.add(no3);
        vertices.add(no4);
        vertices.add(no5);
        vertices.add(no6);
        vertices.add(no7);
        vertices.add(no8);
        vertices.add(no9);
        vertices.add(no10);
        vertices.add(no11);
        vertices.add(no12);
        vertices.add(no13);
        vertices.add(no14);
        vertices.add(no15);
        vertices.add(no16);
        vertices.add(no17);
        vertices.add(no18);
        vertices.add(no19);
        vertices.add(no20);

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
        System.out.println();
        System.out.println("busca em profundidade");
        System.out.println(g1.buscaEmProfundidade("Arad", "Bucareste"));
        System.out.println();
        System.out.println("busca em largura");
        System.out.println(g1.buscaEmLargura("Arad", "Bucareste"));
        return g1;
    }


}
