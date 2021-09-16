package by.academy.lesson20.classwork;

import by.academy.lesson20.Account;

public class WhileThread extends Thread {
	Account account;

	public WhileThread(Account account) {
		super();
		this.account = account;
	}

	public void run() {
		for (;;) {
			synchronized (account) {
				System.out.println("test");
				account.makeWithdrawal(0);
			}
		}
	}
}
