package Task9;
import java.util.Scanner;
public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value");

		n = sc.nextInt();

		//Upper V pattern

		for (i = n; i >= 1; i--) {

		for (j = i; j < n; j++) {

		System.out.print(" ");//print spaces

		}

		for (j = 1; j <= (2 * i - 1); j++) {

		if (j == 1 || j == (2 * i - 1))//Logic for printing star

		System.out.print("*");

		else

		System.out.print(" ");//if logic fails print space

		}

		System.out.println("");

		}

		//Lower Inverted V pattern

		for (i = 2; i <= n; i++) {

		for (j = i; j < n; j++) {

		System.out.print(" ");//Print spaces

		}

		for (j = 1; j <= (2 * i - 1); j++) {

		if (j == 1 || j == (2 * i - 1))//Logic for printing star

		System.out.print("*");

		else

		System.out.print(" ");//if logic fails print space

		}

		System.out.println("");

		}

		}

		}