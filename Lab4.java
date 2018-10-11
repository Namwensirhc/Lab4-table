package lab4;

import java.util.Scanner;

public class Lab4 {

	static Scanner sc = new Scanner(System.in);
	static int input1;
	static String input2;
	static int i;
	static int j;
	static int k;
	static int squared;
	static int cubed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learn your squares and Cubes!");
		input();
	}

	public static void input() {
		System.out.println("hello user!, please enter an interger:");
		input1 = sc.nextInt();
		// System.out.println(input1);
		Number();
		Squared();
		Cubed();
		table();
		again();
	}

	public static void Number() {
		// System.out.println(" Number");
		// System.out.println("=======");
		// System.out.println(input1);
		for (i = 1; i <= input1; ++i) {
			// System.out.println(i);
		}
		// Squared();
	}

	public static void Squared() {
		// System.out.println(" Squared");
		// System.out.println("=======");
		for (i = 1; i <= input1; ++i) {
			squared = (int) (Math.pow(i, 2));
			// System.out.println(squared);
		}
	}

	public static void Cubed() {
		// System.out.println(" Cubed");
		// System.out.println("=======");
		for (i = 1; i <= input1; ++i) {
			cubed = (int) (Math.pow(i, 3));
			// System.out.println(cubed);
		}
	}

	public static void again() {
		System.out.println(); // garbage
		System.out.println("Would you like to play again? (yes/no)");
		input2 = sc.next();
		if (input2.equalsIgnoreCase("yes")) {
			input();
		}
		if (input2.equalsIgnoreCase("no")) {
			end();
		} else {
			System.out.println("Input error, resseting program");
			input();
		}
	}

	public static void table() {
		System.out.println(" Number       Squared      Cubed");
		System.out.println(" ======      ======     =====");
		for (i = 1; i <= input1; ++i) {
			// System.out.printf("\n%-5d", i);

			for (i = 1; i <= input1; ++i) {
				// squared = (int) (Math.pow(i, 2));
				// System.out.printf("\n%15d", squared);
			}
			for (i = 1; i <= input1; ++i) {
				squared = (int) (Math.pow(i, 2));
				cubed = (int) (Math.pow(i, 3));

				// System.out.printf("\n%30d", cubed);
				System.out.printf("\n%5d %15d %25d", i, squared, cubed);
			}
		}

	}

	// System.out.printf("\n%-5d %5d %+5d'", i, squared, cubed);
	// (" " + i + " " + squared + " " + cubed);

	public static void end() {
		System.out.println("Goodbye");
	}
}
