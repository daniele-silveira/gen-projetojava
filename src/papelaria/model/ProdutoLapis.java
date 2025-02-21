package papelaria.model;

public class ProdutoLapis extends Produto {

	private String tipoLapis;

	public ProdutoLapis() {
		super();
	}

	public ProdutoLapis(int codProduto, int tipo, int quantidade, String descricao, float preco, String tipoLapis) {
		super(codProduto, tipo, quantidade, descricao, preco);
		this.tipoLapis = tipoLapis;
	}

	public String getTipoLapis() {
		return tipoLapis;
	}

	public void setTipoLapis(String tipoLapis) {
		this.tipoLapis = tipoLapis;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de lapis: " + this.tipoLapis);
	}

}
