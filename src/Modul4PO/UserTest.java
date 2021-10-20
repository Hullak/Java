package Modul4PO;

public class UserTest {

    public static void main(String[] args) {

//        User user = new User();
        User user = new User("hello","Bartek");

//        user.username = "Bartek";
//        user.password = "qweerty";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
