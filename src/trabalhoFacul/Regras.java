package trabalhoFacul;

public class Regras {
	public Regras(){
		
	}
	
	public void imprimir(){
		System.out.printf(" O Othello (Reversi) � disputado entre dois jogadores em um tabuleiro 8x8 com 64 discos que possui uma cor escura em um dos lados da face e no outro uma cor clara,cujo o objetivo � ficar com mais pe�as da sua cor no tabuleiro ao final do jogo."
				+ "\n A partida come�a com 4 pe�as no centro do tabuleiro, duas brancas e duas pretas"
				+ ", \nsendo sempre as brancas na grande diagonal a1-h8.\nO jogador com as pretas come�a a partida colocando uma pe�a em uma das  quatro op��es marcadas no tabuleiro ao lado."
				+ "\nUma vez que um jogador fa�a uma jogada v�lida, todas as pe�as do oponente que estejam em uma linha reta (horizontal, vertical ou diagonal) entre a pe�a rec�m-colocada e qualquer outra pe�a do jogador que fez o movimento s�o viradas e passam a ser da cor deste jogador."
				+ "\nO jogo termina quando nenhum dos jogadores puder fazer movimentos (por exemplo, quando todas as casas estiverem ocupadas ou todas as pe�as do tabuleiro estiverem com a mesma cor virada para cima."
				+ "\nSe um jogador possuir mais pe�as que o advers�rio, ele vence. Se ambos os jogadores tiverem a mesma quantidade de pe�as, o jogo termina em empate.\n");

	}

}
