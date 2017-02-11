package task1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your text:");
		String text = sc.nextLine();
		System.out.println("Do you wanna save it?(Yes/no)");
		String answer = sc.nextLine();
		String yes = "yes";
		boolean equal = answer.equalsIgnoreCase(yes);
		if (equal == true) {
			System.out.println("Give a name for your text file:");
			String name = sc.nextLine();
			try (PrintWriter a = new PrintWriter(name + ".txt")) {
				a.println(text);
				System.out.println("Your text are saved");
			} catch (FileNotFoundException e) {
				System.out.println("ERROR FILE WRITE");
			}
			
		}
	}

}
