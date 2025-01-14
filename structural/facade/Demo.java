package structural.facade;

public class Demo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();
        Lights lights = new Lights();

        CinemaHall homeTheater = new CinemaHall(dvdPlayer, projector, soundSystem, lights);
        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
        System.out.println("asdfsadfdsaf");
    }

}
