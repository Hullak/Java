package programowanieobjektowe;
// Specjalna metoda ktora zwracają objekt danej klasy i sa wywyoływane podczas tworzenia objektu

public class User {

    public String username;
    public String password;

    public User() {

    }

    public User(String username, String password) {
        System.out.println("Hello z konstruktora");
        this.username = username;
        this.password = password;
     }


    public void sayHello(){
        System.out.println("Hello muy name is " + username);
    }
}
