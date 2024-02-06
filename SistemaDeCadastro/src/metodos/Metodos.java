package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoa.Pessoa;

public class Metodos {

	private List<Pessoa> pessoas;

	public Metodos() {

		this.pessoas = new ArrayList<>();
	}

	public void cadastrarPessoa(String nome, int idade, String email) {
		Pessoa pessoa = new Pessoa(nome, idade, email);
		pessoas.add(pessoa);
		System.out.println("Pessoa cadastrada com sucesso.");
	}

	public void excluirPessoa(String nome) {
		boolean pessoaRemovida = false;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().equalsIgnoreCase(nome)) {
				pessoas.remove(pessoa);
				System.out.println("Pessoa removida com sucesso.");
				pessoaRemovida = true;
				break;
			}
		}
		if (!pessoaRemovida) {
			System.out.println("Pessoa não encontrada.");
		}
	}

	public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas.");
            return;
        }
        System.out.println("Lista de Pessoas Cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println("---------------------------");
        }
	}

	public void alterarPessoa(String nome) {
        boolean pessoaEncontrada = false;
        Scanner scanner = new Scanner(System.in);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                pessoaEncontrada = true;
                System.out.println("Qual informação deseja alterar?");
                System.out.println("1. Nome");
                System.out.println("2. Idade");
                System.out.println("3. Email");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o novo nome:");
                        String novoNome = scanner.nextLine();
                        pessoa.setNome(novoNome);
                        System.out.println("Nome alterado com sucesso.");
                        break;
                    case 2:
                        System.out.println("Digite a nova idade:");
                        int novaIdade = scanner.nextInt();
                        pessoa.setIdade(novaIdade);
                        System.out.println("Idade alterada com sucesso.");
                        break;
                    case 3:
                        System.out.println("Digite o novo email:");
                        String novoEmail = scanner.nextLine();
                        pessoa.setEmail(novoEmail);
                        System.out.println("Email alterado com sucesso.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break;
            }
        }
        if (!pessoaEncontrada) {
            System.out.println("Pessoa não encontrada.");
        }
    }
}