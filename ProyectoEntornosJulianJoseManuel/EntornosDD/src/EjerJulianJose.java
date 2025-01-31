import java.util.*;

public class EjerJulianJose {

	public static void main(String[] args) {
		// For que dice los números pares / impares del 1 al 10
		for (int i = 1; i <= 10; i++)
			System.out.println(i + (i % 2 == 0 ? " es par" : " no es par"));
	}

}
