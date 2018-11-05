package curso.springboot.springboot.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduto;
	private String nomeProduto;
	@Enumerated(EnumType.ORDINAL)
	private TipoProduto tipoProduto;
	private String imagem;
	private Integer quantidadeEstoque;
	private Double preco;
	private Integer peso;
	private BigDecimal comprimento;
	private BigDecimal largura;
	private BigDecimal altura;
	private BigDecimal diametro;
	
	public Produto() {
		super();
	}



	public Produto(Integer idProduto, String nomeProduto, TipoProduto tipoProduto, String imagem,
			Integer quantidadeEstoque, Double preco, Integer peso, BigDecimal comprimento, BigDecimal largura,
			BigDecimal altura, BigDecimal diametro) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.imagem = imagem;
		this.quantidadeEstoque = quantidadeEstoque;
		this.preco = preco;
		this.peso = peso;
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
		this.diametro = diametro;
	}



	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", tipoProduto=" + tipoProduto
				+ ", imagem=" + imagem + ", quantidadeEstoque=" + quantidadeEstoque + ", preco=" + preco + ", peso="
				+ peso + ", comprimento=" + comprimento + ", largura=" + largura + ", altura=" + altura + ", diametro="
				+ diametro + "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}



	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}



	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public BigDecimal getComprimento() {
		return comprimento;
	}

	public void setComprimento(BigDecimal comprimento) {
		this.comprimento = comprimento;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getDiametro() {
		return diametro;
	}

	public void setDiametro(BigDecimal diametro) {
		this.diametro = diametro;
	}	
}
