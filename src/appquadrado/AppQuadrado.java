package appquadrado;
import java.util.Scanner;
public class AppQuadrado {
		public static void main(String[]args) {
			
			
			Scanner sc = new Scanner(System.in);
			Quadrado Quadrado1 = new Quadrado();
			Quadrado Quadrado2 = new Quadrado();
			Quadrado Quadrado3 = new Quadrado(5);
			
			
			System.out.println("Digite o lado do quadrado 1 ");
			Quadrado1.setLado(sc.nextInt());
			System.out.println("Digite o lado do quadrado 2 ");
			Quadrado2.setLado(sc.nextInt());
			
			
			Quadrado1.CalcularArea();
			Quadrado1.CalcularPerimetro();
			Quadrado2.CalcularArea();
			Quadrado2.CalcularPerimetro();
			Quadrado3.CalcularArea();
			Quadrado3.CalcularPerimetro();
			
			if(Quadrado1.CalcularArea() > Quadrado2.CalcularArea() && Quadrado1.CalcularArea() > Quadrado3.CalcularArea()) {
				System.out.println("Quadrado com maior area " + Quadrado1.CalcularArea());
			}else if(Quadrado2.CalcularArea() > Quadrado1.CalcularArea() && Quadrado2.CalcularArea() > Quadrado3.CalcularArea()) {
				System.out.println("Quadrado com maior area " + Quadrado2.CalcularArea());
			}else {
				System.out.println("Quadrado com maior area "  + Quadrado3.CalcularArea());
			}
			
			if(Quadrado1.CalcularPerimetro() < Quadrado2.CalcularPerimetro() && Quadrado1.CalcularPerimetro() < Quadrado3.CalcularPerimetro()) {
				System.out.println("Quadrado com menor perimetro " + Quadrado1.CalcularPerimetro());
			}else if(Quadrado2.CalcularPerimetro() < Quadrado1.CalcularPerimetro() && Quadrado2.CalcularPerimetro() < Quadrado3.CalcularPerimetro()) {
				System.out.println("Quadrado com menor perimetro " + Quadrado2.CalcularPerimetro());
			}else {
				System.out.println("Quadrado com menor perimetro " + Quadrado3.CalcularPerimetro());
		}
	}
}