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
			System.out.println("J� tem pe�a");
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

			mudei = 0;
			acheiPeca = false;

			for (int i = linha - 1; i >= 0; i--) {
				if (tabuleiro[i][coluna].getCaracter().equals(Peca.PecaO)) {
					acheiPeca = true;
				} else {
					mudei++;
				}

				// Transforma as peças da vertical verificando de baixo para cima
				if (acheiPeca == true && mudei > 0) {
					for (int line = linha - 1; !tabuleiro[line][coluna].getCaracter().equals(Peca.PecaO); line--)
						tabuleiro[line][coluna] = new PecaO();
				}
			}

		}

	}

	public void convertePecaHorizontal(int linha, int coluna, boolean jogador) {
		
		Peca peca;
		if (jogador == true )
			peca = new PecaO();
		else {
			peca = new PecaX();
		}
		
			int mudei = 0;
			boolean acheiPeca = false;
			for (int j = coluna + 1; j < Tam_Tabuleiro; j++) {
				if (tabuleiro[linha][j].equals(peca)) {
					acheiPeca = true;
				} else {
					mudei++;
				}

				// Transforma as peças da horizontal verificando da direita para esquerda
				if (acheiPeca == true && mudei > 0) {
					for (j = coluna; j < Tam_Tabuleiro; j++) {
						for (int colun = coluna + 1; !tabuleiro[linha][colun].equals(peca); colun++)
							tabuleiro[linha][colun] = peca;

					}
				}
			}
			mudei = 0;
			acheiPeca = false;

			for (int j = coluna - 1; j >= 0; j--) {
				if (tabuleiro[linha][j].equals(peca)) {
					acheiPeca = true;
				} else {
					mudei++;
				}

				// Transforma as peças da vertical verificando de baixo para cima
				if (acheiPeca == true && mudei > 0) {
					for (int colun = coluna - 1; !tabuleiro[linha][colun].equals(peca); colun--)
						tabuleiro[linha][colun] = peca;
				}
			}

		
	}
}
