package programowanieobjektowe;

public class App {

    String name;

    public void appInfo(){
        System.out.println("Running app with name" + name);
    }

    public App(String name){
        this.name = name;
    }
}
