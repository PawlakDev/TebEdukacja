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
        return super.getInfo()+ " Kierunek: %s".formatted(kierunek);
    }
}
