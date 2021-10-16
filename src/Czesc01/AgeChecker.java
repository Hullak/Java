package Czesc01;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek.");
        int wiek = scanner.nextInt();
        if(wiek>=18) {
            System.out.println("Dziękuję za za zakup");
        }else if (wiek<0) {
            System.out.println("Podaj poprawną wartość");
        }else{
            System.out.println("Nie możesz kupić alkoholu");
        }

    }
}
