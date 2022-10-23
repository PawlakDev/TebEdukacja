import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad4Main {
    public static void main(String[] args){

        /* Przy wykorzystaniu klas, napisz prosty kalkulator
        (dodawanie, odejmowanie, dzielenie, mnożenie). */

        float firstNumber = 0;
        float secondNumber = 0;
        byte decision = 0;

        while (true) {
            firstNumber = 0;
            secondNumber = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                //
                System.out.println("Wpisz pierwsa liczbe");
                firstNumber = scanner.nextFloat();

                //
                System.out.println("Wybierz czynnosc: ");
                System.out.println("1 - Dodaj");
                System.out.println("2 - Odejmij");
                System.out.println("3 - Pomnoz");
                System.out.println("4 - Podziel");
                //
                decision = scanner.nextByte();
                if (decision > 4 || decision < 1) {
                    System.out.println("Ta liczba nie jest przypisana do zadnej operacji");
                    System.exit(0);
                }

                secondNumber = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("******Wyjatek obsluzony*******");
                System.out.println("Blad wczytania liczb");
            }

            Zad4SecondClass Calculations = new Zad4SecondClass();

            try {
                switch (decision) {

                    case 1:
                        System.out.println("Wynik to: " + Calculations.Add(firstNumber, secondNumber));
                        break;
                    case 2:
                        System.out.println("Wynik to: " + Calculations.Del(firstNumber, secondNumber));
                        break;
                    case 3:
                        System.out.println("Wynik to: " + Calculations.Multiply(firstNumber, secondNumber));
                        break;
                    case 4:
                        System.out.println((int) firstNumber / (int) secondNumber);
                        System.out.println("Wynik to: " + Calculations.Divide(firstNumber, secondNumber));
                        break;
                    default:
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("******Wyjatek obsluzony*******");
                System.out.println("Wykryto blad - dzielemnie przez 0");
            }
        }
    }
}
