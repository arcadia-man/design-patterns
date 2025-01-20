package structural.bridge.devices;

public class TV implements Device {
  @Override
  public void turnOn() {
    System.out.println("Turning on the TV");
  }

  @Override
  public void turnOff() {
    System.out.println("Turning off the TV");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("Setting TV volume to " + volume);
  }
}
