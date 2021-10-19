package Modul4PO;

public class Calculator {

        public int addition(int firstNumber, int secondNumber){
            int addition = firstNumber + secondNumber;
            System.out.println("Wynik dodawania " + addition);
            return addition;
        }

        public int substraction(int firstNumber, int secondNumber){
            int subtraction = firstNumber - secondNumber;
            System.out.println("Wynik odejmowania " + subtraction);
            return subtraction;
        }

        public int multiplication(int firstNumber, int secondNumber){
            int multiplication = firstNumber * secondNumber;
            System.out.println("Wynik mnożenia " + multiplication);
            return multiplication;
        }

        public float division(int firstNumber, int secondNumber){
            float division = firstNumber / secondNumber;
            System.out.println("Wynik dzielenia " + division);
            return division;
        }

        public int modulo(int firstNumber, int secondNumber){
            int modulo = secondNumber % firstNumber;
            System.out.println("Wynik modulo " + modulo);
            return modulo;
        }

}
