package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i<driverTypes.length; i++){
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver = getDriver(DriverType.FIREFOX);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();
//        firefoxDriver.findElementBy();
//    }

    }

    public static drivers.ChromeDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
        return new ChromeDriver();

    }
}
