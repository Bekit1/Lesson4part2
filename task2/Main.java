package task2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// fillAndPrintArrays(a);
		System.out.println("Enter height of object:");
		int x = sc.nextInt();
		System.out.println("Enter width of object:");
		int y = sc.nextInt();
		int a[][] = new int[x][y];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter a" + i + j);
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Do you wanna save it?(Yes/no)");
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		String yes = "yes";
		boolean equal = answer.equalsIgnoreCase(yes);
		if (equal == true) {
			System.out.println("Give a name for your text file:");
			String name = scan.nextLine();
			try (PrintWriter b = new PrintWriter(name + ".txt")) {
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						b.print(a[i][j] + " ");
					}
					b.println();
				}
				System.out.println("Your text are saved");
			} catch (FileNotFoundException e) {
				System.out.println("ERROR FILE WRITE");
			}
		}

	}
}
