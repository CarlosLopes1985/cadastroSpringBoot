package curso.springboot.springboot.model;

public enum TipoProduto {
	
	PINTURA("Pintura"),ARTESANATO("artesanato");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private TipoProduto(String descricao) {
		this.descricao = descricao;
	}
	
	
}
