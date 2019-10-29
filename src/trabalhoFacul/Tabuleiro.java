package trabalhoFacul;

public class Tabuleiro {

	private int Tam_Tabuleiro = 8;
	private Peca tabuleiro[][];
	public int contador = 0;

	public Tabuleiro() {
		tabuleiro = new Peca[Tam_Tabuleiro][Tam_Tabuleiro];

		for (int i = 0; i < Tam_Tabuleiro; i++) {
			for (int j = 0; j < Tam_Tabuleiro; j++) {

				tabuleiro[i][j] = new PecaVazia();

			}

		}

		tabuleiro[3][3] = new PecaX();
		tabuleiro[3][4] = new PecaO();
		tabuleiro[4][3] = new PecaO();
		tabuleiro[4][4] = new PecaX();

	}

	public void imprimir() {
		for (int i = 0; i < Tam_Tabuleiro; i++) {
			for (int j = 0; j < Tam_Tabuleiro; j++) {

				System.out.printf(tabuleiro[i][j].getCaracter());

			}
			System.out.printf("\n");
		}
	}

	public void jogada(int linha, int coluna, boolean jogador) {
		if (jogador == true) {

			tabuleiro[linha][coluna] = new PecaO();
		} else {
			tabuleiro[linha][coluna] = new PecaX();

		}
	}

	public boolean verificaEspaco(int linha, int coluna) {

		if (!tabuleiro[linha][coluna].getCaracter().equals(Peca.PecaVazia)) {
			System.out.println("Já tem peça");
			return true;
		} else
			contador++;
		return false;

	}

	public boolean contaJogada() {
		if (contador < 2) {
			return true;
		} else {
			System.out.println("Jogadas realizadas: " + contador);
			return false;
		}
	}

}