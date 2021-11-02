package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarke za pomocą Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przegladarce Firefox");
    }
}
