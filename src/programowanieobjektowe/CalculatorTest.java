package programowanieobjektowe;
import java.util.Scanner;

public class CalculatorTest {

// Napisz program ktory poprosi uzytkownika o 2 liczby, nastepnie wykona na nich podstawowe operacje matematyczne
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        calculator.addition(firstNumber,secondNumber);
        calculator.substraction(firstNumber,secondNumber);
        calculator.multiplication(firstNumber,secondNumber);
        calculator.division(firstNumber,secondNumber);
        calculator.modulo(firstNumber,secondNumber);
    }
}
