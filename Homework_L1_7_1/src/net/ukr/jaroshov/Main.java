package net.ukr.jaroshov;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Введите текст... Для окончания ввода в новой строке введите -'STOP'");
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		for (;;) {
			String text = sc.nextLine();
			if ((text.lastIndexOf("STOP") != -1) || (text.lastIndexOf("stop") != -1)) {
				break;
			}
			sb.append(text);
			sb.append(System.lineSeparator());
		}
		File file = new File("a.txt");
		String textDoc = sb.toString();
		saveTextToFile(textDoc, file);
		System.out.println("Файл записан 'a.txt'");
		sc.close();
	}

	public static void saveTextToFile(String text, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
