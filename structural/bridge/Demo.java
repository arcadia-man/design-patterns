package structural.bridge;

import structural.bridge.devices.Device;
import structural.bridge.devices.Radio;
import structural.bridge.devices.TV;
import structural.bridge.remotes.BasicRemote;
import structural.bridge.remotes.RemoteControl;

public class Demo {
  public static void main(String[] args) {
    Device tv = new TV();
    RemoteControl tvRemote = new BasicRemote(tv);

    tvRemote.powerButton(); // Output: Turning on the TV
    tvRemote.volumeUp(); // Output: Setting TV volume to 10

    Device radio = new Radio();
    RemoteControl radioRemote = new BasicRemote(radio);

    radioRemote.powerButton(); // Output: Turning on the Radio
    radioRemote.volumeDown(); // Output: Setting Radio volume to 5
  }
}
