package papelaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import papelaria.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController  produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		// Produto prod1 = new Produto(001,3, 10, "Caderno", 15.9f);
		// prod1.visualizar();

		int opcao, quantidade, codProduto, tipo;
		float preco;
		String descricao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             ESTOQUE PAPELARIA JAVA                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar                            ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
//			System.out.println("            ? - Saida de Estoque   | Melhoria        ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nPapelaria Java!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo produto \n\n");

				System.out.println("Digite o código Produto: ");
				leia.skip("\\R?");
				codProduto = leia.nextInt();

				do {
					System.out.println("Digite o Tipo do Produto (1-Papel ou 2-Lapis): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("Produto Papel: ");
				}
				case 2 -> {
					System.out.println("Produto Lapis: ");

				}
				}

				System.out.println("Digite a quantidade do Produto: ");
				leia.skip("\\R?");
				quantidade = leia.nextInt();

				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				descricao = leia.nextLine();

				System.out.println("Digite a preço do Produto: ");
				leia.skip("\\R?");
				preco = leia.nextFloat();

				keyPress();

				break;

			case 2:
				System.out.println("\n Listar todas os produtos");
				produtos.visualizar();
				keyPress();

				break;

			case 3:
				System.out.println("\n Buscar Conta por número");
				keyPress();

				break;

			case 4:
				System.out.println("\n Atualizar dados da Conta");

				System.out.println("Digite o número da conta: ");
				keyPress();

				break;
			case 5:
				System.out.println("\n Apagar Conta");

				keyPress();

				break;

			case 6:
				System.out.println("\n Sair");

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
		System.out.println("Projeto Desenvolvido por: Daniele S. ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
