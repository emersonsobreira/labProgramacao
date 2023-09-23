package questão08;

public interface Imprimivel {

	void imprimir();
}

class Documento implements Imprimivel{
	private String informacao;
	
	public Documento(String informacao) {
		this.informacao = informacao;
	}
	public void imprimir() {
		System.out.println(informacao);
	}
}

class Foto implements Imprimivel{
	private String descricao;
	
	public Foto(String descricao) {
		this.descricao = descricao;
	}
	public void imprimir() {
		System.out.println(descricao);
	}
}
