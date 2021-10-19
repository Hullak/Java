package Modul4PO;

public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1111;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();
    }
}
