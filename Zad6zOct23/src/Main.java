public class Main {
    public static void main(String[] args) {
        UJK ujk = new UJK(1,"ujk","Gdansk","Opis","ABC");
        Politechnika_Sw politechnika = new Politechnika_Sw(2,"politechnika","Szczecin","Tutaj jest opis","Informacja o kierunkach");
        System.out.println(ujk.getInfo());
        System.out.println(politechnika.getInfo());
    }
}