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
			System.out.println("\nO Produto número: " + produto.getCodProduto() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO Produto número: " + produto.getCodProduto() + " não foi encontrado!");
		}
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto)) {
				System.out.println("\nO Produto número: " + numero + " foi deletado com sucesso!");
			}
		} else {
			System.out.println("\nO Produto número: " + numero + " não foi encontrado!");
		}
	}

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.println("\nO Produto número: " + numero + " não foi encontrado.");
		}
	}

	@Override
	public void listarTodos() {
		if (listaProdutos.isEmpty()) {
			System.out.println("\nNenhum produto cadastrado.");
		} else {
			for (var produto : listaProdutos) {
				produto.visualizar();
			}
		}
	}

	public Produto buscarNaCollection(int codProduto) {
		for (var produto : listaProdutos) {
			if (produto.getCodProduto() == codProduto) {
				return produto;
			}
		}
		return null;
	}

}
