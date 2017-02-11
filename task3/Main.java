package task3;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Type a name of folder that you wanna analyse:");
		String name=sc.nextLine();
		File folder = new File(name);
		listOfFolders(folder);
	}

	static void listOfFolders(File file) {
		File[] arrayFile = file.listFiles();
		for (File files : arrayFile) {
			boolean dir = files.isDirectory();
			if (dir == true) {
				System.out.println(files);

			}
		}
	}
}