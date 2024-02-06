package lerLetras;

public class ContagemLetraA {

	public static void main(String[] args) {

		String texto = "Eu sou a pessoa mais incrível que eu posso ser, "
				+ "e através do meu esforço vou conquistar o que já é MEU.";

		int contagem = 0;

		texto = texto.toLowerCase();

		for (char c : texto.toCharArray()) {
			if (c == 'a') {
				contagem++;
			}
		}

		System.out.println("Quantidade de letras 'a' encontradas: " + contagem);
	}
}
