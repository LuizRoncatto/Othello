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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		if (caracter == null) {
			if (other.caracter != null)
				return false;
		} else if (!caracter.equals(other.caracter))
			return false;
		return true;
	}

}
