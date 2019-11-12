package trabalhoFacul;
/**Classe Regras
 * Esta classe diz respeito as regras do jogo a mesma somente e utilizada
 * quando o usuario quer saber das regras no menu de acoes.
 * @author lpadilha
 *
 */
public class Regras {
	public Regras() {

	}

	public void imprimir() {
		System.out.printf(
				" O Othello (Reversi) e disputado entre dois jogadores em um tabuleiro 8x8 com 64 discos que possui uma cor escura em um dos lados da face e no outro uma cor clara,cujo o objetivo é ficar com mais peças da sua cor no tabuleiro ao final do jogo."
						+ "\n A partida comeca com 4 pecas no centro do tabuleiro, duas brancas e duas pretas"
						+ ", \nsendo sempre as brancas na grande diagonal a1-h8.\nO jogador com as pretas comeca a partida colocando uma peca em uma das  quatro opcoes marcadas no tabuleiro ao lado."
						+ "\nUma vez que um jogador faca uma jogada valida, todas as pecas do oponente que estejam em uma linha reta (horizontal, vertical ou diagonal) entre a peca recem-colocada e qualquer outra peça do jogador que fez o movimento sao viradas e passam a ser da cor deste jogador."
						+ "\nO jogo termina quando nenhum dos jogadores puder fazer movimentos (por exemplo, quando todas as casas estiverem ocupadas ou todas as peças do tabuleiro estiverem com a mesma cor virada para cima."
						+ "\nSe um jogador possuir mais pecas que o adversario, ele vence. Se ambos os jogadores tiverem a mesma quantidade de peças, o jogo termina em empate.\n");

	}

}
