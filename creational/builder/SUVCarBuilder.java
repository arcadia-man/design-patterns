package creational.builder;

public class SUVCarBuilder implements CarBuilder {
  private Car car;

  public SUVCarBuilder() {
    this.car = new Car();
  }

  @Override
  public void buildEngine() {
    car.setEngine("SUV Engine");
  }

  @Override
  public void buildWheels() {
    car.setWheels("SUV Wheels");
  }

  @Override
  public void buildSeats() {
    car.setSeats("SUV Seats");
  }

  @Override
  public void buildColor() {
    car.setColor("Black");
  }

  @Override
  public Car getCar() {
    return this.car;
  }
}
