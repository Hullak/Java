package identifires.second;

import identifires.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostepu do pol/metod private oraz default

    public void testIdentifires() {
        System.out.println(first);
        //  System.out.println(second);
        System.out.println(third);
        firstMethod();
        //  secondMethod();
        thirdMethod();
    }
}
