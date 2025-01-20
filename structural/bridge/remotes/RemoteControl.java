package structural.bridge.remotes;

import structural.bridge.devices.Device;

public abstract class RemoteControl {
  protected Device device;

  public RemoteControl(Device device) {
    this.device = device;
  }

  public abstract void powerButton();

  public abstract void volumeUp();

  public abstract void volumeDown();
}
