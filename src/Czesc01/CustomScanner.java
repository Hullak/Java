package Czesc01;

import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Poda swoje imię");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + " !"); */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        int firstNumber = scanner.nextInt();

        System.out.println("Kwardat tej liczby to: " + firstNumber*firstNumber);

    }
}
