package creational.builder;

public class Demo {
  public static void main(String[] args) {
    // Creating a sports car by director
    CarBuilder sportsCarBuilder = new SportsCarBuilder();
    Director director = new Director(sportsCarBuilder);
    Car sportsCar = director.constructCar();
    System.out.println(sportsCar);

    // Creating an SUV car by director
    CarBuilder suvCarBuilder = new SUVCarBuilder();
    director = new Director(suvCarBuilder);
    Car suvCar = director.constructCar();
    System.out.println(suvCar);
  }
}
