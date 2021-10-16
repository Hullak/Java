package Czesc01;

public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && koniunkcja (i / równoczesnie) -> true kiedy oba wyrazenia skladowe są prawdziwe
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || lub - jedno true
        System.out.println(firstValue || secondValue); // true
        System.out.println(firstValue || fourthValue); // true
        System.out.println(secondValue || thirdValue); // false

        // ! negacja - wartosc przeciwna
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!thirdValue);

    }
}
