package identifires.first;

public class Child extends Parent{

    //klasa potomna w tej paczce nie ma dostepu do pól/metod private
    public void testIdentifires(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();
    }
}
