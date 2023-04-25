import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        read("src/fichier.txt");
    }

    public static void read(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void print2() {
        String content = "Ceci est le contenu ajouté en plus test";

        File myObj = new File("src/fichier.txt"); // Specify the filename

        try {
            PrintWriter myWriter = new PrintWriter(new FileWriter(myObj, true));
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void print() {
        String content = "Ceci est le contenu ajouté en plus";

        File myObj = new File("src/fichier.txt"); // Specify the filename

        try {
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}