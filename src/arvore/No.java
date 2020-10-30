package arvore;

public class No {

	private float _valor;
	private String _nome;
	private No _esquerdo;
	private No _direito;

	public No() {
		_valor = 0;
	}

	public float GetValor() {
		return _valor;
	}

	public void SetValor(float valor, String nome) {
		_valor = valor;
		_nome = nome;
	}

	public No GetDireito() {
		return _direito;
	}

	public void SetNoDireito(No no) {
		_direito = no;
	}

	public No GetEsquerdo() {
		return _esquerdo;
	}

	public void SetNoEsquerdo(No no) {
		_esquerdo = no;
	}

	public String get_nome() {
		return _nome;
	}

	public void set_nome(String _nome) {
		this._nome = _nome;
	}

}
