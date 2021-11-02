package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Otwieram strone przez przegladarke Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Znjduje element przez Safari");
            }
        };

        safari.get();
        safari.findElementBy();
    }
}
