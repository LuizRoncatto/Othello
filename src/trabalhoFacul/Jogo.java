package trabalhoFacul;

import java.util.Scanner;

public class Jogo {

	protected boolean jogador = true;

	public Jogo() {

	}

	public void initJogo() {

		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.imprimir();

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("faca sua jogada");

			System.out.println("Digite a linha");
			int linha = entrada.nextInt()-1;
			System.out.println("Digite a coluna");
			int coluna = entrada.nextInt()-1;

			if (tabuleiro.verificaEspaco(linha, coluna) == true) {

			} else {
				tabuleiro.jogada(linha, coluna, jogador);

				tabuleiro.convertePecaVertical(linha, coluna, jogador);
				tabuleiro.convertePecaHorizontal(linha, coluna, jogador);

				jogador = !jogador;
			}
			tabuleiro.imprimir();

			tabuleiro.contaJogada();
			tabuleiro.verificaGanhador();
		} while (tabuleiro.contador < 64);
		
		entrada.close();

	}

}