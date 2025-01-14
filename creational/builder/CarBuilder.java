package creational.builder;

public interface CarBuilder {
  void buildEngine();

  void buildWheels();

  void buildSeats();

  void buildColor();

  Car getCar();
}
