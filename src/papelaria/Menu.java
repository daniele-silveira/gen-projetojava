package papelaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import papelaria.controller.ProdutoController;
import papelaria.model.ProdutoLapis;
import papelaria.model.ProdutoPapel;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();
		
		Scanner leia = new Scanner(System.in);

		// Produto prod1 = new Produto(001,3, 10, "Caderno", 15.9f);
		// prod1.visualizar();

		int opcao = 0;
		int quantidade = 0;
		int codProduto = 0;
		int tipo = 0;
		float preco = 0f;
		String descricao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("             ESTOQUE PAPELARIA JAVA                  ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Cadastrar                            ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
//			System.out.println("            ? - Saida de Estoque   | Melhoria        ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada: ");

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				continue;
			}

			if (opcao == 6) {
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\nCadastrar novo produto");

				System.out.print("Digite o código do Produto: ");
				leia.skip("\\R?");
				codProduto = leia.nextInt();

				do {
					System.out.print("Digite o Tipo do Produto (1-Papel ou 2-Lapis): ");
					tipo = leia.nextInt();
					leia.nextLine();
				} while (tipo < 1 && tipo > 2);

				System.out.print("Digite a quantidade do Produto: ");
				quantidade = leia.nextInt();
				leia.nextLine();

				System.out.print("Digite o Nome do Produto: ");
				descricao = leia.nextLine();

				System.out.print("Digite o preço do Produto: ");
				preco = leia.nextFloat();
				leia.nextLine();

				switch (tipo) {
				case 1 -> {
					System.out.print("Digite a gramatura do papel: ");
					int gramatura = leia.nextInt();
					leia.nextLine();

					System.out.print("Digite a cor do papel: ");
					String cor = leia.nextLine();

					produtos.cadastrar(
							new ProdutoPapel(codProduto, tipo, quantidade, descricao, preco, gramatura, cor));
				}
				case 2 -> {
					System.out.print("Digite o tipo do lápis: ");
					String tipoLapis = leia.nextLine();

					produtos.cadastrar(new ProdutoLapis(codProduto, tipo, quantidade, descricao, preco, tipoLapis));
				}
				}
				break;

			case 2:
				produtos.listarTodos();
				keyPress();
				break;

			case 3:
				System.out.print("\nBuscar Produto por número\nDigite o código do produto: ");
				codProduto = leia.nextInt();
				produtos.buscarNaCollection(codProduto);
				keyPress();
				break;

			case 5:
				System.out.print("\nApagar Produto\nDigite o código do produto: ");
				codProduto = leia.nextInt();
				produtos.deletar(codProduto);
				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Daniele S.");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		try {
			System.out.print("\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
