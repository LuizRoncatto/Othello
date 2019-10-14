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
		tabuleiro[4][4] = new PecaX() ;

	}

	public void imprimir() {
		for (int i = 0; i < Tam_Tabuleiro; i++) {
			for (int j = 0; j < Tam_Tabuleiro; j++) {

				System.out.printf(tabuleiro[i][j].getCaracter());

			}
			System.out.printf("\n");
		}
	}

}
