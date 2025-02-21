package papelaria.controller;

import java.util.ArrayList;

import papelaria.model.Produto;
import papelaria.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto " + produto.getDescricao() + " foi cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodProduto());
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nA Produto numero: " + produto.getCodProduto() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA Produto numero: " + produto.getCodProduto() + " não foi encontrado!");

	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nA Produto numero: " + numero + " foi deletado com sucesso!");
		} else
			System.out.println("\nA Produto numero: " + numero + " não foi encontrado!");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	public ProdutoController() {
		// TODO Auto-generated constructor stub
	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int codProduto) {
	    for (Produto produto : listaProdutos) {
	        if (produto.getCodProduto() == codProduto) {
	            return produto;
	        }
	    }
	    return null; 
	}

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}


	

}
