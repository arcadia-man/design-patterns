package creational.builder;

public class Director { 
  private CarBuilder carBuilder;

  public Director(CarBuilder carBuilder) {
    this.carBuilder = carBuilder;
  }

  public Car constructCar() {
    carBuilder.buildEngine();
    carBuilder.buildWheels();
    carBuilder.buildSeats();
    carBuilder.buildColor();
    return carBuilder.getCar();
  }
}
