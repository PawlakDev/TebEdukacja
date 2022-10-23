import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        int number;
        int[] tab= new int[10];
        Scanner scanner = new Scanner(System.in);

        //Zapisywanie
        for(int i=0;i<10;i++){
            tab[i] = scanner.nextInt();
        }

        //Wyświetlanie
        for(int j=0;j<10;j++){
            System.out.println("Liczba: " + tab[j]);
        }
    }
}
