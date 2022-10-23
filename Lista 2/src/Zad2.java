import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] tab = new int[n];

        int i=1;
        //Zapis
        while(i<=n){
            tab[i-1] = i;
            i++; // Inkrementacja
        }
        //Wyświetlanie
        i=1;
        while(i<=n){
            System.out.println(tab[i-1]);
            i++;
        }
    }
}
