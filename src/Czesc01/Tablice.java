package Czesc01;

public class Tablice {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Kasia";
        imiona[2] = "Konrad";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};

        for (int i=0; i<lottoNumbers.length;i++) {
            System.out.println(lottoNumbers[i]);

//        int[] number = new int[] {1,2,3,4,5,6};
//        System.out.println(number[0]);
//        System.out.println(number[1]);
//        System.out.println(number[2]);
//        System.out.println(number[3]);
//        System.out.println(number[4]);
//        System.out.println(number[5]);
//
//        System.out.println(number.length);


        }

    }
}
