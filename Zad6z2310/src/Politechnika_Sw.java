public class Politechnika_Sw extends Uczelnia{
    String kierunek;
    public Politechnika_Sw(long id, String nazwa, String miejscowość, String opis, String kierunek) {
        super(id, nazwa, miejscowość, opis);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    public String getInfo(){
        System.out.println("cos");
        return super.getInfo()+ " Kierunek: %s".formatted(kierunek);
    }

    //cos nowego
}
