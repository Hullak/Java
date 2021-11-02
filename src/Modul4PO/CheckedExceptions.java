package Modul4PO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\konrad.kolodziej\\IdeaProjects\\Java\\src\\Test.txt");
       } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("CLosing file");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}

