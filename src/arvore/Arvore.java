package arvore;

import java.util.ArrayList;
import java.util.List;

public class Arvore {

	private No _raiz;
	private List<No> _childrens;

	public Arvore(float valor, String nome) {
		_childrens = new ArrayList<No>();

		_raiz = new No();
		_raiz.SetValor(valor, nome);
	}

	public No GetRaiz() {
		return _raiz;
	}

	public void Inserir(float valor, String nome) {
		Inserir(_raiz, valor, nome);
	}

	private void Inserir(No raiz, float valor, String nome) {
		if (raiz.GetValor() >= valor) {
			if (raiz.GetEsquerdo() != null) {
				Inserir(raiz.GetEsquerdo(), valor, nome);
			} else {
				No no = new No();
				no.SetValor(valor, nome);
				raiz.SetNoEsquerdo(no);
			}
		} else {
			if (raiz.GetDireito() != null) {
				Inserir(raiz.GetDireito(), valor, nome);
			} else {
				No no = new No();
				no.SetValor(valor, nome);
				raiz.SetNoDireito(no);
			}
		}
	}

	public List<No> GetNosChildren() {
		return _childrens;
	}

	public No BusqueNo(float valor) {
		if (_raiz.GetValor() == valor) {
			return _raiz;
		}

		if (_raiz.GetValor() > valor)
			return BusqueNo(_raiz.GetEsquerdo(), valor);
		else
			return BusqueNo(_raiz.GetDireito(), valor);
	}

	private No BusqueNo(No no, float valor) {
		if (valor == no.GetValor())
			return no;

		if (valor > no.GetValor())
			return BusqueNo(no.GetDireito(), valor);
		else
			return BusqueNo(no.GetDireito(), valor);
	}

//	public void RemoveMaiorDaEsquerda(No no) {
//		if (no.GetEsquerdo() == null) {
//			return;
//		}
//
//		No aux = ObtenhaMaiorDaSubArvoreAEsquerda(no.GetEsquerdo());
//		if (aux.GetDireito() != null) {
//			no.SetValor(aux.GetDireito().GetValor());
//
//		} else {
//			no.SetValor(aux.GetValor());
//		}
//
//		aux.SetNoDireito(null);
//	}
//
//	private No ObtenhaMaiorDaSubArvoreAEsquerda(No no) {
//		if (no.GetDireito() != null) {
//			No aux = no.GetDireito();
//			No frente = aux.GetDireito();
//
//			if (frente == null || aux == null) {
//				return no;
//			}
//
//			if (frente.GetEsquerdo() == null && frente.GetDireito() == null) {
//				return aux;
//			}
//		}
//
//		return ObtenhaMaiorDaSubArvoreAEsquerda(no.GetDireito());
//	}
//
//	// Outra Forma
//	private void RemonteFilhos() {
//		if (_childrens.isEmpty()) {
//			for (No children : _childrens) {
//				Inserir(children.GetValor());
//			}
//
//			_childrens = new ArrayList<No>();
//		}
//	}
//
//	public void RemoverMenorDaSubADireita(No no) {
//		if (no.GetDireito() == null && no.GetEsquerdo() == null) {
//			return;
//		}
//
//		No noAuxSubstituto = null;
//		No auxSubArvoreDireita = no.GetDireito();
//
//		if (auxSubArvoreDireita != null) {
//			if (auxSubArvoreDireita.GetEsquerdo() != null) {
//				noAuxSubstituto = auxSubArvoreDireita.GetEsquerdo();
//			}
//		}
//
//		if (noAuxSubstituto != null) {
//			if (noAuxSubstituto.GetEsquerdo() != null) {
//				DesmonteSubArvore(noAuxSubstituto);
//			}
//		}
//
//		no.SetValor(noAuxSubstituto.GetValor());
//		auxSubArvoreDireita.SetNoEsquerdo(null);
//
//		RemonteFilhos();
//	}
//
//	private void DesmonteSubArvore(No no) {
//		if (no.GetEsquerdo() == null && no.GetDireito() == null) {
//			return;
//		}
//
//		if (no.GetEsquerdo() != null) {
//			_childrens.add(no.GetEsquerdo());
//			DesmonteSubArvore(no.GetEsquerdo());
//		}
//
//		if (no.GetDireito() != null) {
//			_childrens.add(no.GetDireito());
//			DesmonteSubArvore(no.GetDireito());
//		}

//	}
}
