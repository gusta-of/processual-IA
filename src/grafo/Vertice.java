package grafo;

// https://github.com/mario-martins-ifood/algoritmos.grafos

import java.util.ArrayList;

public class Vertice {
    private String nome;
    private int distancia = 0;
    private Vertice pai;
    private ArrayList<Aresta> incidentes = new ArrayList<Aresta>();
    private ArrayList<Vertice> filhos = new ArrayList<Vertice>();
    private ArrayList<Vertice> vizinhos = new ArrayList<Vertice>();
    private boolean visitado = false;

    public Vertice(String nome
    , Vertice... pai
    ){
        this.nome = nome;
        if (pai.length >= 1) {
            // System.out.println();
            this.pai = pai[0];
            this.pai.addFilhos(this);
        } else {
            this.pai = this;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public ArrayList<Aresta> getIncidentes() {
        return incidentes;
    }

    // public void setIncidentes(ArrayList<Aresta> incidentes) {
    //     this.incidentes = incidentes;
    // }

    public boolean isVizinho(Vertice vizinho){
		for (int i=0; i < this.vizinhos.size() ; i++)
			if (this.vizinhos.get(i).getNome().equals(vizinho.getNome()))
				return true;		
		return false;
    }
    
    public void addIncidentes(Aresta incide) {
		this.incidentes.add(incide);
		
		//adicionando vizinhos a lista
		if ( (incide.getOrigem().getNome().equals(this.getNome())) &&
				(!this.isVizinho(incide.getDestino())) ){
			
            this.setVizinhos(incide.getDestino());
            if(incide.getDestino().getPai() == null){
                this.addFilhos(incide.getDestino());
            }
			
		}else if ( (incide.getDestino().getNome().equals(this.getNome())) &&
				(!this.isVizinho(incide.getOrigem())) ){
			
			this.setVizinhos(incide.getOrigem());
		}
    }

    public void addFilhos(Vertice filho) {
		this.filhos.add(filho);
    }
    public ArrayList<Vertice> getFilhos() {
        return filhos;
    }


    
    public ArrayList<Vertice> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(Vertice vizinho) {
        this.vizinhos.add(vizinho);
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    // @Override
	// public int compareTo(Vertice vertice) {
		
    //     if(this.getDistancia() < vertice.getDistancia()) 
    //     	return -1;
    //     else if(this.getDistancia() == vertice.getDistancia()) 
    //     	return 0;

    //     return 1;  
    // }
    
    @Override
	public String toString() {
		String s = " ";
		s+= this.getNome();
		return s;
	}
}
