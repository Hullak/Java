package Modul4PO;

//Klasa jest pewnego rodzaju szablonem/schematem/przepisem na podstawie ktorego mozna tworzyć objekty
public class Student {

    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

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

}
