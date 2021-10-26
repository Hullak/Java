package Modul4PO;

public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciezarowka z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka!");
    }

    @Override
    public String info() {
        return "Ciezarowka";
    }
    public void zatankuj(){
        System.out.println("Aby mieć dużo siły musze zjesc obiad");
    }
}
