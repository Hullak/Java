package programowanieobjektowe;
// stwórz klasę bazową  App - zawiera pole name i metode appInfo, dodaj konstruktor do ktorego przekazesz wartosc name
// stworz klase potomnę AndroidApp i IphoneApp = zawiera metode runAndroidApp / runIphoneApp

public class AppChecker {

    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphone = new IphoneApp("CalculatorIOS");
        iphone.appInfo();
        iphone.runIphoneApp();

    }
}
