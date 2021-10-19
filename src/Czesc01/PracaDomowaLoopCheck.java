// Wypisz liczby z zakresu 1-100 podzielne przez 3
// Odwróć elementy tablicy [1,3,5] -> [5,3,1]

package Czesc01;

public class PracaDomowaLoopCheck {

    public static void main(String[] args) {
//
//        for (int number = 1; number <= 100; number++) {
//            if (number%3 == 0) {
//                System.out.println("Moj numer to: " + number + " i jest podzielny przez 3 i mniejszy od 100");
//            }
//        }
//
//            int[] intArray = {1, 3, 5, 7, 0};
//
//            //print array starting from first element
//            System.out.println("Original Array:");
//            for(int i=0;i<intArray.length;i++)
//                System.out.print(intArray[i] + "  ");
//
//            System.out.println();
//
//            //print array starting from last element
//            System.out.println("Original Array printed in reverse order:");
//            for(int i=intArray.length-1;i>=0;i--)
//                System.out.print(intArray[i] + "  ");
//
//            System.out.println( "\nRozwiązania Bartka");

            int[] numbers = new int[] {1,3,5,7,0};

            for (int i=0;i<(numbers.length/2);i++) {
                int temp = numbers[i];  // dla i=0  wartosc 1 /2iteracja/ 1=1  temp=3
                numbers[i] = numbers[numbers.length - 1 - i];   // nadpisujemy 1 element ostatnim//-1 bo numerujemy od 0 // .lenght bedzie elementem 4(5-1-0) czyli 0 /// 4->0 3(lenght(5)-1-1)->7
                numbers[numbers.length - 1 - i] = temp;  // odwolujemy się do ostatniego numeru tej iteracji -1-i i przypisujemy wartosc temp =1 // numbers[3] =3 (lenght(5)-1-1)
                System.out.println("Iteracja numer " + i);

            }

                for (int i=0; i < numbers.length; i++){
                System.out.println(numbers[i]);
        }
    }
}
