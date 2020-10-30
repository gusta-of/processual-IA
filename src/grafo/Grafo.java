package grafo;
import java.util.*;
// import java.util.LinkedList;
// https://github.com/mario-martins-ifood/algoritmos.grafos

public class Grafo {
	
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>(); 
	private boolean hasCycle = false;
	
	public void clearLists(){
		this.arestas.clear();
		this.arestas.clear();
		this.vertices.clear();
		this.setHasCycle(false);
	}

	public boolean isHasCycle() {
		return hasCycle;
	}

	public void setHasCycle(boolean hasCycle) {
		this.hasCycle = hasCycle;
	}

	public void addAresta(int peso, String origem, String destino){
		int i,j,k;
		
		//adiciona vertices e retorna posicao
		i = this.addVertice(origem);
		j = this.addVertice(destino);
		
		//adiciona aresta na lista
		Aresta a = new Aresta(peso,
				this.vertices.get(i),
				this.vertices.get(j));
		
		this.arestas.add(a);
		k = this.arestas.size();
		
		//adiciona aresta na lista de arestas incidentes em cada vertice
		this.vertices.get(i).addIncidentes(this.arestas.get(k-1));
		this.vertices.get(j).addIncidentes(this.arestas.get(k-1));
	}
			
	public void setArestas(ArrayList<Aresta> arestas) {
		this.clearLists();
		
		for (int i=0; i<arestas.size() ; i++)
			this.addAresta(arestas.get(i).getPeso(), 
							arestas.get(i).getOrigem().getNome(), 
							arestas.get(i).getDestino().getNome() );
	}

	public void setVertices(ArrayList<Vertice> vertices) {
		this.clearLists();
		
		for (int i=0; i<vertices.size() ; i++){

			//se ja existir na lista nao passara daqui
			if(this.posicaoVertice(vertices.get(i).getNome())==this.vertices.size()){
				//adicionando as arestas correspondentes a tais vertices
				for(int j=0; j<vertices.get(i).getIncidentes().size(); j++){

					//se o adicionado for a origem desse seu incidente, e o seu destino estiver na lista de vertices
					if ( (vertices.get(i).getNome().equals(vertices.get(i).getIncidentes().get(j).getOrigem().getNome())) &&
							(this.posicaoVertice(vertices.get(i).getIncidentes().get(j).getDestino().getNome())!=this.vertices.size()) ){

						this.addAresta(vertices.get(i).getIncidentes().get(j).getPeso(), 
										vertices.get(i).getIncidentes().get(j).getOrigem().getNome(), 
										vertices.get(i).getIncidentes().get(j).getDestino().getNome());
					
					//se o adicionado for o destino desse seu incidente, e o sua origem estiver na lista de vertices	
					}else if ( (vertices.get(i).getNome().equals(vertices.get(i).getIncidentes().get(j).getDestino().getNome())) &&
							(this.posicaoVertice(vertices.get(i).getIncidentes().get(j).getOrigem().getNome())!=this.vertices.size()) ){

						this.addAresta(vertices.get(i).getIncidentes().get(j).getPeso(), 
								vertices.get(i).getIncidentes().get(j).getOrigem().getNome(), 
								vertices.get(i).getIncidentes().get(j).getDestino().getNome());
						
					}
				}
				this.addVertice(vertices.get(i).getNome());
			}
		}
	}

	public int addVertice(String nome){
		int i= this.posicaoVertice(nome); 
		
		if(i==this.vertices.size()){
			this.vertices.add(new Vertice(nome));
			return (this.vertices.size() - 1);
		}
		
		return i;
	}
	
	public void limparVerticesPai(){
		for(int i=0; i<this.getVertices().size() ;i++)
			this.getVertices().get(i).setPai(null);
	}
	
	public void limparVerticeVisitado(){
		for(int i=0; i<this.getVertices().size() ;i++)
			this.getVertices().get(i).setVisitado(false);
	}
	
	public void limparArestaVisitada(){
		for(int i=0; i<this.getArestas().size() ;i++)
			this.getArestas().get(i).setVisitado(false);
	}
	
	public void imprimeArvore(){
		for (int i=0; i<arestas.size();i++)
			System.out.println(
				"Custo:" + this.arestas.get(i).getPeso() + 
				" | De: " + this.arestas.get(i).getOrigem().getNome() + 
				" -> Para: " + this.arestas.get(i).getDestino().getNome());
				
		System.out.println();
	}

	public ArrayList<Vertice> getVertices() {
		return vertices;
	}
	public Vertice getVertice(String nome) {
		for (Vertice vertice : this.vertices) {
			if(nome == vertice.getNome()){
				return vertice;
			}
		}
		return null;
	}
	
	public int posicaoVertice(String nome){
		int i;
		
		for (i=0; i<this.vertices.size() ; i++)
			if (this.vertices.get(i).getNome().equals(nome))
				return i;
		
		//se nao encontrar retorna o tamanho da lista vertices
		return this.vertices.size();
	
	}
	
	public Vertice acharVertice(String nome){
		return this.vertices.get(this.posicaoVertice(nome));
	}
	
	public Aresta acharAresta(Vertice vet1, Vertice vet2){
		for(int i=0; i<this.arestas.size();i++){
			if( ((this.arestas.get(i).getOrigem().getNome().equals(vet1.getNome())) &&
				(this.arestas.get(i).getDestino().getNome().equals(vet2.getNome()))) ||
				((this.arestas.get(i).getOrigem().getNome().equals(vet2.getNome())) &&
				(this.arestas.get(i).getDestino().getNome().equals(vet1.getNome()))) ){
				return this.arestas.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Aresta> getArestas() {
		return arestas;
    }
    

	// implementacao original
	public	ArrayList<Aresta> buscaEmLargura(String raiz, String buscado){

    	ArrayList<Aresta> arvoreLargura = new ArrayList<Aresta>(); 
    	for (Vertice v:this.vertices) {
    		v.setCor("branco");
    	}
    	
    	Vertice v = this.acharVertice(raiz);
    	v.setCor("cinza");
    	
    	LinkedList<Vertice> queue= new LinkedList<Vertice>();
    	queue.add(v);
    	boolean achou = false;
    	while (queue.size() > 0) {
    		Vertice current = queue.remove();
    		current.setCor("preto");
    		if (current.getNome().equals(buscado)) {
    			achou = true;
    			break;
    		}
    		
    		for (Vertice visinho:current.getVizinhos()) {
    			if(visinho.getCor().equals("branco")){
    				visinho.setCor("cinza");
    				queue.add(visinho);
    				arvoreLargura.add(this.acharAresta(current, visinho));
    			}
    		}
    	}
    	
    	if (achou) {
    		System.out.println("Vertice encontrado");
    	} else {
    		System.out.println("Vertice nao encontrado");
    	}
    	
    	return arvoreLargura;
    }
    
    // public	ArrayList<Aresta> buscaEmLargura(String raiz, String buscado){

    // 	ArrayList<Aresta> arvoreLargura = new ArrayList<Aresta>(); 
    	
    // 	Vertice v = this.acharVertice(raiz);
	// 	v.setVisitado(true);
		
    // 	LinkedList<Vertice> borda= new LinkedList<Vertice>();
    // 	borda.add(v);
    // 	boolean achou = false;
    // 	while (borda.size() > 0) {
	// 		Vertice current = borda.remove();
    // 		// current.setCor("preto");
    // 		if (current.getNome().equals(buscado)) {
    //             achou = true;
    //             current.setVisitado(true);
    // 			break;
    // 		}
    		
    // 		for (Vertice visinho:current.getVizinhos()) {
	// 			if(visinho.getCor().equals("branco")){
	// 				visinho.setCor("cinza");
	// 				borda.add(visinho);
	// 				arvoreLargura.add(this.acharAresta(current, visinho));
	// 			}
	// 		}
    // 	}
    	
    // 	if (achou) {
    // 		System.out.println("Vertice encontrado");
    // 	} else {
    // 		System.out.println("Vertice nao encontrado");
    // 	}
    	
    // 	return arvoreLargura;
	// }
	//------------------BUSCA-EM-PROFUNDIDADE----------------------------------
    
    //metodo que chama a busca recursiva em profundidade e retorna a arvore da busca em profundidade
    public	ArrayList<Aresta> buscaEmProfundidade(String raiz, String buscado){

    	ArrayList<Aresta> arvoreProfundidade = new ArrayList<Aresta>(); 
    	
    	if(this.buscaRecursiva(raiz, buscado))
    		System.out.println("Vertice encontrado");
    	else
    		System.out.println("Vertice nao encontrado");
    	
    	for (int i=0; i<this.arestas.size(); i++){
    		if(this.arestas.get(i).isVisitado())
    			arvoreProfundidade.add(this.arestas.get(i));
    	}
    	
    	return arvoreProfundidade;
    }
    
    //metodo recursivo que retorna um booleano como resposta da busca pelo vertice e seta como true os vertices e arestas que estarao na arvore de Busca em Profundidade
    public boolean buscaRecursiva(String raiz, String buscado){
		
    	int posRaiz = this.posicaoVertice(raiz);
    	
    	this.vertices.get(posRaiz).setVisitado(true);
		
    	if (!raiz.equals(buscado)){
    		for(int i=0; i<this.vertices.get(posRaiz).getVizinhos().size();i++){
    			
    			if (!this.vertices.get(posRaiz).getVizinhos().get(i).isVisitado()){
	    			//acha aresta entre eles e seta como visitada
	    			this.acharAresta(this.vertices.get(posRaiz), this.vertices.get(posRaiz).getVizinhos().get(i)).setVisitado(true);
	    			//continua busca recursivamente
	    			if (this.buscaRecursiva(this.vertices.get(posRaiz).getVizinhos().get(i).getNome(),buscado))
	    				return true;
	    		}
	    	}
    	}else{
    		return true;
    	}
    	return false;
    }
    
}
	