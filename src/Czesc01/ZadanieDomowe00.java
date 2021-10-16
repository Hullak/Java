package Czesc01;

import java.util.Scanner;

public class ZadanieDomowe00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;

        System.out.println("Wynik odejmowania pierwszej przez druga: " + subtraction);
        System.out.println("Wynik dzielenia pierwszej przez druga: " + division);
        System.out.println("Wynik mnożenia pierwszej razy drugą: " + multiplication);
        System.out.println("Wynik modulo pierwszej z drugiej: " + modulo);
    }
}
