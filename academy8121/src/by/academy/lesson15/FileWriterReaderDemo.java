package by.academy.lesson15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
	public static void main(String[] args) {
		char[] array = new char[50];
		int size = 0;
		File file = new File("fileWrite.txt");
		try (FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {

			fw.write("Learn\nJava!\n");
			fw.flush();

			System.out.println("Количество прочитанных символов: " + size + " ");
			while (fr.read() != -1) {
				System.out.println();
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}