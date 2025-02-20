package papelaria.model;

public abstract class Produto {

	private int codProduto;
	private int tipo;
	private int quantidade;
	private String descricao;
	private float preco;

	public Produto(int codProduto, int tipo, int quantidade, String descricao, float preco) {
		super();
		this.codProduto = codProduto;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.preco = preco;

	}

	public Produto() {
		
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void adicionar(int quantidade) {
		if (quantidade > 0) {

			this.quantidade += quantidade;
			System.out.println("Quantidade adicionada com sucesso. Total em estoque: " + this.quantidade);
		} else {
			System.out.println("A quantidade adicionada deve ser maior que zero.");

		}
	}

	public void visualizar() {
		System.out.println("Código do Produto: " + this.codProduto);
		System.out.println("Descrição:  " + this.descricao);
		System.out.println("Tipo:  " + this.tipo);
		System.out.println("Preço: " + this.preco);
		System.out.println("Quantidade em estoque:  " + this.quantidade);

	}

}
