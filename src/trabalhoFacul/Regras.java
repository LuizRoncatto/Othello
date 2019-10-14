package trabalhoFacul;

public class Regras {
	public Regras(){
		
	}
	
	public void imprimir(){
		System.out.printf(" O Othello (Reversi) é disputado entre dois jogadores em um tabuleiro 8x8 com 64 discos que possui uma cor escura em um dos lados da face e no outro uma cor clara,cujo o objetivo é ficar com mais pe�as da sua cor no tabuleiro ao final do jogo."
				+ "\n A partida começa com 4 peças no centro do tabuleiro, duas brancas e duas pretas"
				+ ", \nsendo sempre as brancas na grande diagonal a1-h8.\nO jogador com as pretas começa a partida colocando uma peça em uma das  quatro opções marcadas no tabuleiro ao lado."
				+ "\nUma vez que um jogador faça uma jogada válida, todas as peças do oponente que estejam em uma linha reta (horizontal, vertical ou diagonal) entre a peça recém-colocada e qualquer outra peça do jogador que fez o movimento são viradas e passam a ser da cor deste jogador."
				+ "\nO jogo termina quando nenhum dos jogadores puder fazer movimentos (por exemplo, quando todas as casas estiverem ocupadas ou todas as peças do tabuleiro estiverem com a mesma cor virada para cima."
				+ "\nSe um jogador possuir mais peças que o adversário, ele vence. Se ambos os jogadores tiverem a mesma quantidade de peças, o jogo termina em empate.\n");

	}

}
