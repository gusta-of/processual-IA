package grafo;
// https://github.com/mario-martins-ifood/algoritmos.grafos

import java.util.ArrayList;

public class Aresta {
    private int peso;
    private Vertice origem;
    private Vertice destino;
    // private ArrayList<Vertice> vertices; 
    private boolean visitado = false;


    public Aresta(int peso, Vertice origem, Vertice destino){
        this.peso = peso;
        this.origem = origem;
        this.destino = destino;
        this.origem.addIncidentes(this);
        this.destino.addIncidentes(this);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }


    // @Override
    // public String toString() {
    //     String s = " ";
	// 	s+= this.getOrigem().getNome() + "->"+ this.getDestino().getNome();
	// 	return s;
    // }
    @Override
	public String toString() {
		String s = " \n";
        s+= 
        this.getOrigem().getNome() + " -> " +
        this.getDestino().getNome();
		return s;
	}
}
