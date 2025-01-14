package creational.builder;

public class SportsCarBuilder implements CarBuilder {
  private Car car;

  public SportsCarBuilder() {
    this.car = new Car();
  }

  @Override
  public void buildEngine() {
    car.setEngine("Sports Engine");
  }

  @Override
  public void buildWheels() {
    car.setWheels("Sports Wheels");
  }

  @Override
  public void buildSeats() {
    car.setSeats("Sports Seats");
  }

  @Override
  public void buildColor() {
    car.setColor("Red");
  }

  @Override
  public Car getCar() {
    return this.car;
  }
}
