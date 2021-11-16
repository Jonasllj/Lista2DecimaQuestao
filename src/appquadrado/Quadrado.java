package appquadrado;

public class Quadrado {
	private int  lado;
	
	
	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public Quadrado() {
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}

	
	public void setLado(int lado) {
		this.lado = lado;
	}

	public int CalcularArea() {
		return lado*lado;
	}
	
	public int CalcularPerimetro() {
		return lado+lado+lado+lado;
	}
}
