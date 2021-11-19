package programowanieobjektowe;

public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1111);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto bmw = new Auto("BMW", "M4", 2021, 100);
        bmw.jedz();
        bmw.hamuj();
        bmw.info();
    }
}
