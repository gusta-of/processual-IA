package main;

import java.util.ArrayList;

import arvore.Arvore;
import grafo.Aresta;
import grafo.Grafo;
import grafo.Vertice;

public class Main {

	public static void main(String[] args) {
		
		Arvore arvore = new Arvore(500, "raiz");
		
		arvore.Inserir(1, "no 1");
		arvore.Inserir(35, "no 35");
		arvore.Inserir(3, "no 3");
		arvore.Inserir(44, "no 44");
		arvore.Inserir(10, "no 10");
		arvore.Inserir(6, "no 6");
		arvore.Inserir(450, "no 450");
		
		
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
        System.out.println("busca em largura");
        System.out.println(g1.buscaEmLargura("1", "2"));
        // System.out.println("busca em profundidade");
        // System.out.println(g1.buscaEmProfundidade("1", "7"));
          
	}
}
