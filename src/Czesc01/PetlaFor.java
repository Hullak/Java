package Czesc01;

public class PetlaFor {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i = i+2) { // i specjalna zmienna sterująca;warunek do kiedy ma sie petla wykonywac;jak i bedzei sie zmienialo
        System.out.println(i);
        }
        for (int i=0; i<100; i++) {
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}
