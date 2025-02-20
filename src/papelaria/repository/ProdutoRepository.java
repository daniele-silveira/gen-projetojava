package papelaria.repository;

import papelaria.model.Produto;

public interface ProdutoRepository {
	
	//CRUD
		
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);
	public void procurarPorNumero(int numero);
	public void listarTodos();
	
	

}
