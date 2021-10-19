package Modul4PO;

public class Metody {


    public int policzWynik() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Resultat to: " + result);
        return result;
    }

    public int policzWynikparam(int number) {
        System.out.println("Wartosc number to: " + number);
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Resultat to: " + result);
        return result;
    }


    public int add(int firstNumber, int secondNumber) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
        if(firstNumber==0){
            return 0;
        }
        return firstNumber + secondNumber;
        }
}
