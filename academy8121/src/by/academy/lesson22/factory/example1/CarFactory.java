package by.academy.lesson22.factory.example1;

public class CarFactory {

	public Car buildCar(CarModel model) {
		switch (model) {
		case SEDAN:
			return new SedanCar();
		case LUXARY:
			return new LuxaryCar();
		case SMALL:
			return new SmallCar();
		default:
			throw new UnsupportedOperationException(model.toString());
		}
	}

}
