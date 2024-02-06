package main;

import java.util.Scanner;

import metodos.Metodos;
import pessoa.Pessoa;

public class Main {
	public static void main(String[] args) {
		
		
		        Metodos cadastro = new Metodos();
		        Scanner scanner = new Scanner(System.in);
		        int opcao;

		        do {
		            System.out.println("----- CADASTRO DE PESSOAS -----");
		            System.out.println("Selecione a opção desejada:");
		            System.out.println("1. Cadastrar pessoa");
		            System.out.println("2. Excluir pessoa");
		            System.out.println("3. Listar pessoas");
		            System.out.println("4. Alterar pessoa");
		            System.out.println("0. Sair");
		            opcao = scanner.nextInt();
		            scanner.nextLine();

		            switch (opcao) {
		                case 1:
		                    System.out.println("Digite o nome da pessoa:");
		                    String nome = scanner.nextLine();
		                    System.out.println("Digite a idade da pessoa:");
		                    int idade = scanner.nextInt();
		                    scanner.nextLine();
		                    System.out.println("Digite o email da pessoa:");
		                    String email = scanner.nextLine();
		                    cadastro.cadastrarPessoa(nome, idade, email);
		                    break;
		                case 2:
		                    System.out.println("Digite o nome da pessoa a ser excluída:");
		                    String nomeExcluir = scanner.nextLine();
		                    cadastro.excluirPessoa(nomeExcluir);
		                    break;
		                case 3:
		                    cadastro.listarPessoas();
		                    break;
		                case 4:
		                    System.out.println("Digite o nome da pessoa a ser alterada:");
		                    String nomeAlterar = scanner.nextLine();
		                    cadastro.alterarPessoa(nomeAlterar);
		                    break;
		                case 0:
		                    System.out.println("Encerrando o programa...");
		                    break;
		                default:
		                    System.out.println("Opção inválida.");
		                    break;
		            }

		            System.out.println();

		        } while (opcao != 0);
		    }
		}