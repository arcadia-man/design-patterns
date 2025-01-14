package structural.facade;

public class CinemaHall {
  private DVDPlayer dvdPlayer;
  private Projector projector;
  private Lights lights;
  private SurroundSoundSystem soundSystem;

  public CinemaHall(DVDPlayer dvdPlayer, Projector projector, SurroundSoundSystem soundSystem, Lights lights) {
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
    this.soundSystem = soundSystem;
    this.lights = lights;

  }

  public void watchMovie(String movie) {
    System.out.println("Getting ready to watch a movie...");
    lights.dim(10);
    projector.on();
    projector.wideScreenMode();
    soundSystem.on();
    soundSystem.setVolume(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }

  public void endMovie() {
    System.out.println("Shutting down the cinema hall...");
    dvdPlayer.off();
    projector.off();
    soundSystem.off();
    lights.on();
  }
}
