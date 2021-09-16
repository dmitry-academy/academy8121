package by.academy.lesson20.classwork;

import java.util.LinkedList;

public class PortDemo {

	public static void main(String... args) {
		LinkedList<Dock> docks = new LinkedList<>();

		docks.add(new Dock(0, "Alfa"));
		docks.add(new Dock(0, "Beta"));
		docks.add(new Dock(0, "Gamma"));

		Port port = new Port(docks);

		Thread ship1 = new Thread(new Ship(port, 4, true));
		Thread ship2 = new Thread(new Ship(port, 4, true));
		Thread ship3 = new Thread(new Ship(port, 4, true));
		Thread ship4 = new Thread(new Ship(port, 4, true));
		Thread ship5 = new Thread(new Ship(port, 4, true));
		Thread ship6 = new Thread(new Ship(port, 20, true));

		ship1.start();
		ship2.start();
		ship3.start();
		ship4.start();
		ship5.start();
		ship6.start();
	}
}
