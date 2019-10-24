package trabalhoFacul;

public class Tabuleiro {

	private int Tam_Tabuleiro = 8;
	private Peca tabuleiro[][];

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

		System.out.println(" " + 12345678);
		for (int i = 0; i < Tam_Tabuleiro; i++) {
			System.out.print(i + 1);
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
			return false;

	}

	public void convertePecaVertical(int linha, int coluna, boolean jogador) {
		if (jogador == true) {
			int mudei = 0;
			boolean acheiPeca = false;
			for (int i = linha + 1; i < Tam_Tabuleiro; i++) {
				if (tabuleiro[i][coluna].getCaracter().equals(Peca.PecaO)) {
					acheiPeca = true;
				} else {
					mudei++;
				}
				
				// Transforma as peças da vertical verificando de cima para baixo
				if (acheiPeca == true && mudei > 0) {
					for (int line = linha + 1; !tabuleiro[line][coluna].getCaracter().equals(Peca.PecaO); line++)
						tabuleiro[line][coluna] = new PecaO();
				}

			}

		}

	}

}
