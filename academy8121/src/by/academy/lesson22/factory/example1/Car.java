package by.academy.lesson22.factory.example1;

public class Car {

	private CarModel model;

	public Car(CarModel model) {
		super();
		this.model = model;
	}

	public CarModel getModel() {
		return model;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}

}
