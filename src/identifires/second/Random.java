package identifires.second;

import identifires.first.Parent;

public class Random {

    // klasa w innej paczce nie ma dostepu do pol/metod private default i protected

    Parent parent = new Parent();

    public void testIdentifires() {
        System.out.println(parent.first);
        parent.firstMethod();
    }
}
