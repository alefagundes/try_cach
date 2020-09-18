package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Inform the frase!:");
		String[] vect = sc.nextLine().split(" ");
		System.out.println("Inform the value that you wish print in  ther scream:");
		int position = sc.nextInt();
		
			System.out.println("word" + ":" + vect[position]) ;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		catch(InputMismatchException i) {
			System.out.println("the value of variable is not trued!");
		}
		System.out.println();
		System.out.println("End the Program!");
		sc.close();
	}

}
