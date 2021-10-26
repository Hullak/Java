// Stworz 3 objekty klasy student. Przypisz wartosci pol. Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody

package Modul4PO;

public class PdStudentChecker {

    public static void main(String[] args) {

        Student.infoUczelnia();

        Student studentA = new Student();
        studentA.imię = "Janek";
        studentA.nazwisko = "Kowal";
        studentA.email = "janek.kowal@o2.pl";
        studentA.nick = "JK";
        studentA.numerIndeksu = 666;

        Student studentB = new Student();
        studentB.imię = "Janek";
        studentB.nazwisko = "Kowal";
        studentB.email = "janek.kowal@o2.pl";
        studentB.nick = "JK";
        studentB.numerIndeksu = 667;

        Student studentC = new Student();
        studentC.imię = "Janek";
        studentC.nazwisko = "Kowal";
        studentC.email = "janek.kowal@o2.pl";
        studentC.nick = "JK";
        studentC.numerIndeksu = 667;

        Student[] students = new Student[]{studentA,studentB,studentC};

        for (int i=0;i<(students.length);i++) {
            students[0].przedstawSie();
            students[0].zalogujSie();
            students[0].podajNumerIndeksu();
            students[0].podajEmail();
        }

    }
}
