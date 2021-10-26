package Modul4PO;

public class Rower implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkościa " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem!");
    }

    @Override
    public String info() {
        return "Rower";
    }
}
