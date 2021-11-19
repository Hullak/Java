package programowanieobjektowe;

//Klasa jest pewnego rodzaju szablonem/schematem/przepisem na podstawie ktorego mozna tworzyć objekty
public class Student {

    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie(){
        System.out.println("Nazwyam się: " + imię + " " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguję się: " + nick);
    }
    public void podajNumerIndeksu(){
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Moj email to: " + email);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to: " + nazwaUczelni);
        druga();
    }

    public static void druga(){
        System.out.println("Jestem drugą metodą");
    }
}
