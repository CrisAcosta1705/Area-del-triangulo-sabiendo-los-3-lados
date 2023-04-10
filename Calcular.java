package ejercicio;
import java.util.Scanner;
public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		double P, Area, resultado;
		int a, b, c;
		
		System.out.println("Ingrese el lado A del triangulo:");
		a = tc.nextInt();
		
		System.out.println("Ingrese el lado B del triangulo:");
		b = tc.nextInt();
		
		System.out.println("Ingrese el lado C del triangulo:");
		c = tc.nextInt();
		
		P = (a+b+c)/2;
		Area = (P*(P-a)*(P-b)*(P-c));
		resultado = Math.sqrt(Area);
		System.out.println("Lado A: "+a);
		System.out.println("Lado B: "+b);
		System.out.println("Lado C: "+c);
		System.out.println("El Area del triangulo es: "+resultado);
	}

}
