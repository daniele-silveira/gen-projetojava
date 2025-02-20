package papelaria;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		// teste

		Scanner leia = new Scanner(System.in);

		int opcao, qtde;
		String produto;

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
			System.out.println("            6 - Saida de Esqoque                     ");
			System.out.println("            7 - Sair                                 ");
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

			if (opcao == 7) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo produto \n\n");

				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				produto = leia.nextLine();
				
				break;
				
			case 2:
				System.out.println("\n Listar todas os produtos");
				
				
				break;
				
			case 3:
				System.out.println("\n Buscar Conta por número");

				break;
				
			case 4:
				System.out.println("\n Atualizar dados da Conta");

				System.out.println("Digite o número da conta: ");

				break;
			case 5:
				System.out.println("\n Apagar Conta");
				
				break;
			case 6:
				System.out.println("\n Sacar");
				
				System.out.println("Digite o Numero da conta: ");
				
				break;
			case 7:
				System.out.println("\n Depositar");
				
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

}
