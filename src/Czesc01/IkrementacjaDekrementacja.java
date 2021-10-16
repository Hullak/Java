package Czesc01;

// postinkrementacja=najpierw przypisanie wartości dopiero później zwiększenie wartości o 1
// preinkrementacja=najpierw zwiększenie wartości później przypisanie
public class IkrementacjaDekrementacja {

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartość a: " +a);  // 0
        int b = a++;
        System.out.println("Wartość a: " +b);  // 0
        System.out.println("Wartość a: " +a);  // 1
        int c = ++a;
        System.out.println("Wartość a: " +c);  // 2
        System.out.println("Wartość a: " +a);  // 2

        int d = 0;
        System.out.println("Wartość a: " +d);  // 0
        int e = d--;
        System.out.println("Wartość a: " +e);  // 0
        System.out.println("Wartość a: " +d);  // -1
        int f = --d;
        System.out.println("Wartość a: " +f);  // -2
        System.out.println("Wartość a: " +d);  // -2


    }
}
