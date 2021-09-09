package by.academy.lesson19.treads;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("innter counter: " + i);
			MultithreadingDemo.incrementCounter();
		}
	}

}