package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 24);

        Student med = new Student() {
            @Override
            public boolean sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
                return true;
            }
        };
        sayHello("Kate", med, 22);

        Student noStudent = (name, age) -> {
            System.out.println("I am not a student, My name is " + name + " I am " + age);
            if (age >18) {
                System.out.println("You can buy a beer");
            }
            return false;
        };
        sayHello("Tom", noStudent, 18);
    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name,age);
    }
}
