package net.ukr.jaroshov;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		File file = new File("a.txt");	

		int[][] array = new int[][] {{100,5626,8490,958}, {4,5,6,7},{515,7484,1100,10}};
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				String number = String.format("%5.5s", "" + array[i][j]);
				sb.append(number + "\t");
			}
			sb.append(System.lineSeparator());
		}
		String text = sb.toString();
		
		saveTextToFile(text, file);	
		System.out.println("Файл записан");
	}

	public static void saveTextToFile(String text, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
