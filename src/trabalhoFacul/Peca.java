package trabalhoFacul;

public class Peca {
	
	protected static String PecaX = "X";
	protected static String PecaO = "O";
	protected static String PecaVazia = "-";
	
	protected String caracter;
	
	public Peca(String caracter) {
		this.caracter = caracter;
	}

	public String getCaracter() {
		return caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}
	
	
	

}
