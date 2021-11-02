package exceptoins;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionCheck {

    public static void main(String[] args) throws InvalidAgeException {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swój wiek");
            int age = scanner.nextInt();

            if (age <= 0){
                throw new InvalidAgeException("Wiek jest niepoprawny");
            }
            if (age >=18){
                System.out.println("Jestes pelnoletni");
            }else {
                System.out.println("Nie jestes pelnoletni");
            }
        }
    }

