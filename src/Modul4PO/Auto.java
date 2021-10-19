package Modul4PO;

//Klasa jest pewnego rodzaju szablonem/schematem/przepisem na podstawie ktorego mozna tworzyć objekty
public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public void jedz(){
        System.out.println("Jedz!");
    }

    public void hamuj(){
        System.out.println("Hamuj");
    }

    public void info(){
        System.out.println("Nazwa marki: " + marka);
        System.out.println("Nazwa modelu: " + model);
        System.out.println("Rok prod: " + rok);
        System.out.println("Przebieg: " + przebieg);
    }
}

