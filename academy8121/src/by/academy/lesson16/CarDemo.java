package by.academy.lesson16;

import java.io.IOException;

public class CarDemo {
	public String a = "1";

	public static void main(String[] args) throws IOException {
		Car[] cars = { new Car(CarTypes.COMPACT, 34000), new Car(CarTypes.SPORT, 44000),
				new Car(CarTypes.COMPACT, 14000), new Car(CarTypes.COMPACT, 10000) };

		CarDemo carDemo = new CarDemo();

		Searchable expensiveCarsSearch = new ExpensiveCarsSearch();
		Searchable compactCarSearch = new CompactCarSearch();

		System.out.println(carDemo.getCarsNumber(cars, expensiveCarsSearch));
		System.out.println(carDemo.getCarsNumber(cars, compactCarSearch));
		System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return car.getCost() < 15000;
			}
		}));

		System.out.println(carDemo.getCarsNumber(cars, c -> {
			return c.getCost() < 15000;
		}));

	}

	private int getCarsNumber(Car[] cars, Searchable search) {
		int result = 0;
		for (Car car : cars) {
			if (search.test(car)) {
				result++;
			}
		}
		return result;
	}

}
