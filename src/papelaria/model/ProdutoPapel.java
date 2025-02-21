package papelaria.model;

public class ProdutoPapel extends Produto {

	private float gramatura;
	private String cor;

	public ProdutoPapel(int codProduto, int tipo, int quantidade, String descricao, float preco, float gramatura,
			String cor) {
		super(codProduto, tipo, quantidade, descricao, preco);
		this.gramatura = gramatura;
		this.cor = cor;
	}

	public float getGramatura() {
		return gramatura;
	}

	public void setGramatura(float gramatura) {
		this.gramatura = gramatura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de lapis" + this.gramatura + " e cor." + this.cor);
	}

}
