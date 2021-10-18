package Czesc01;

public class InstrukcjaSterujacaSwitch {

    public static void main(String[] args) {
        String danie = "Pizza";

        switch(danie) {
            case "Pizza":
                System.out.println("Cena to 22zł");
                break;
            case "Losos":
                System.out.println("Cena to 30zł");
                break;
            case "Frytki":
                System.out.println("Cena to 11zł");
                break;
            default:
                System.out.println("Nie ma takiego dania w karcie");

        }
    }
}
