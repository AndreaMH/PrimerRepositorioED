package refactorizar;
/**
 * Clase para refactorizar
 * Esto es un ejemplo para usar la opci�n team
 */
import java.util.Scanner;

import JavaDoc.Circulo;

public class UsoCirculo {
	
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		//Solicitar datos del primer c�rculo
		Circulo circulo1 = solicitarDatosCirculo(1);
		
		//Solicitar datos del segundo c�rculo
		Circulo circulo2 = solicitarDatosCirculo(2);
		
		//Comparar c�rculos
		compararCirculos(circulo1, circulo2);
		
	sc.close();

	}

	private static void compararCirculos(Circulo circulo1, Circulo circulo2) {
		//Comparamos los radios y las circunferencias
		if (circulo1.getRadio() > circulo2.getRadio()) {
			System.out.println("El c�rculo con mayor radio es" + circulo1);
		} else {
			System.out.println("El c�rculo con mayor radio es" + circulo2);
		}
		
		if (circulo1.getCircunferencia() > circulo2.getCircunferencia()) {
			System.out.println("El c�rculo con mayor circunferencia es" + circulo1);
		} else {
			System.out.println("El c�rculo con mayor circunferencia es" + circulo2);
		}
	}

	private static Circulo solicitarDatosCirculo(int i) {
		System.out.println("Introduce la coordenada x del centro del c�rculo" + i);
		String sX = sc.nextLine();
		double x = Double.parseDouble(sX);
		
		System.out.println("Introduce la coordenada y del centro del c�rculo" + i);
		String sY = sc.nextLine();
		double y = Double.parseDouble(sY);
		
		System.out.println("Introduce el radio del c�rculo" + i);
		String sRadio = sc.nextLine();
		double radio = Double.parseDouble(sRadio);
		
		Circulo circulo = new Circulo(x, y, radio);
		
		return circulo;
	}

}
