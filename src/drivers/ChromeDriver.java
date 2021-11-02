package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarke za pomocą Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element za pomocą Chrome");
    }
}
