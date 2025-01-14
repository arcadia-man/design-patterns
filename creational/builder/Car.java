package creational.builder;

public class Car {
	private String engine;
	private String wheels;
	private String seats;
	private String color;

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [Engine=" + engine + ", Wheels=" + wheels + ", Seats=" + seats + ", Color=" + color + "]";
	}
}
