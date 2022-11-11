public class Main {
    public static void main(String[] args) {
        System.out.println("Nauczyciel:");
        Nauczyciel nauczyciel = new Nauczyciel(1,"Jan","Kowalski","Torun",13313132145L);
        System.out.println(nauczyciel);

        System.out.println("Uczen: ");
        Uczen uczen = new Uczen(2, "Johny", "Bravo", "Krakow", 12345678912L, "druga");
        System.out.println(uczen);

        System.out.println("Uczelnia: ");
        Uczelnia uczelnia = new Uczelnia(3,"bydgoszcz","AGH","Super Uczelnia");
        System.out.println(uczelnia);

        System.out.println("Kierunek: ");
        Kierunek kierunek = new Kierunek(4,"Informatyka", "Najlepsza Informatyka");
        System.out.println(kierunek);

        System.out.println("Oceny: ");
        Oceny oceny = new Oceny(5, 6, "Za checi");
        System.out.println(oceny);
    }
}