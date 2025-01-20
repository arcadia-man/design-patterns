package structural.bridge.devices;

public class Radio implements Device {
  @Override
  public void turnOn() {
    System.out.println("Turning on the Radio");
  }

  @Override
  public void turnOff() {
    System.out.println("Turning off the Radio");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("Setting Radio volume to " + volume);
  }
}