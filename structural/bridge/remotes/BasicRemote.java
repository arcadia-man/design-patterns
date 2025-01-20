package structural.bridge.remotes;

import structural.bridge.devices.Device;

public class BasicRemote extends RemoteControl {

  public BasicRemote(Device device) {
    super(device);
  }

  @Override
  public void powerButton() {
    System.out.println("Power button pressed.");
    device.turnOn();
  }

  @Override
  public void volumeUp() {
    System.out.println("Increasing volume.");
    device.setVolume(10);
  }

  @Override
  public void volumeDown() {
    System.out.println("Decreasing volume.");
    device.setVolume(5);
  }
}
