package papelaria.model;

public class ProdutoLapis extends Produto {
	
	private float ponta;

	public ProdutoLapis(int codProduto, int tipo, int quantidade, String descricao, float preco) {
		super(codProduto, tipo, quantidade, descricao, preco);
		// TODO Auto-generated constructor stub
	}
	
	

	public ProdutoLapis() {
		super();
	}



	public ProdutoLapis(int codProduto, int tipo, int quantidade, String descricao, float preco, float ponta) {
		super(codProduto, tipo, quantidade, descricao, preco);
		this.ponta = ponta;
	}


	public float getPonta() {
		return ponta;
	}


	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de lapis (mm)" + this.ponta);
	}
	

}
