package by.academy.lesson20;

import by.academy.lesson20.classwork.WhileThread;

public class AccountDanger {
	public static void main(String[] args) {
		Account account = new Account();

		Thread one = new Thread(account);
		Thread two = new Thread(account);

		Thread whileThread = new WhileThread(account);

		one.setName("Fred");
		two.setName("Lucy");
		whileThread.setName("while");
		
		
		whileThread.start();
		one.start();
		two.start();
	}
}