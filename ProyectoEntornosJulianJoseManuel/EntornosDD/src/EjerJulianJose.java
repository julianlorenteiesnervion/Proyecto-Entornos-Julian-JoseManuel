import java.util.*;

public class EjerJulianJose {

	public static void main(String[] args) {
		// For que dice los números pares / impares del 1 al 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + (i % 2 == 0 ? " es par" : " no es par"));
		}
		// For que muestra los números del 1 al 20
		System.out.println("Estos son los numero desde el 1 al 20");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		// For que muestra los números del 21 al 40
		for (int i = 21; i <= 40; i++){
			System.out.print(i + " ")
		}
	}

}
