package by.academy.lesson11.exceptions;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		System.out.println("1");
		main(args);
	}
}