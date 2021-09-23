package by.academy.lesson22.factory.example1;

public class FactoryDemo {

	public static void main(String[] args) {

		CarFactory factory = new CarFactory();

		Car car1 = factory.buildCar(CarModel.LUXARY);
		Car car2 = factory.buildCar(CarModel.SMALL);
		Car car3 = factory.buildCar(CarModel.SEDAN);

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
