package programowanieobjektowe;

public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom",33,"UJ");
        teacher.walk();
        teacher.eat();
//        teacher.sayHello();
//        teacher.teachMath();


        Footballer footballer = new Footballer("Mike",21,"Juve");
        footballer.walk();
        footballer.eat();
//        footballer.playFootball();
    }
}
