import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Zad3 {
    public static void main(String[] args) throws IOException {
            String sentence ;
            String sentenceonfile;

            Scanner scanner = new Scanner(System.in);

            File file = new File("example.txt");

            if(!file.exists()) {
                file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter("example.txt");

            sentence = scanner.nextLine();

            printWriter.println(sentence);

            printWriter.close();

            Scanner odczyt = new Scanner(new File("example.txt"));
            sentenceonfile = odczyt.nextLine();
            odczyt.close();

            System.out.println(sentenceonfile);
    }
}
