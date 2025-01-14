package structural.facade;

public class SurroundSoundSystem {
  public void on() {
    System.out.println("Surround Sound System is on");
  }

  public void setVolume(int level) {
    System.out.println("Surround Sound System volume set to " + level);
  }

  public void off() {
    System.out.println("Surround Sound System is off");
  }
}