package net.ukr.jaroshov;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File folder = new File("C:");
		listFolders(folder);
	}

	public static void listFolders(File folder) {
		File[] files = folder.listFiles();

		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println(file);
			}
		}
	}
}
