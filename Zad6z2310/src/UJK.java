public class UJK extends Uczelnia{
    private String dziekan;

    public UJK(long id, String nazwa, String miejscowość, String opis, String dziekan) {
        super(id, nazwa, miejscowość, opis);
        this.dziekan = dziekan;
    }

    public String getDziekan() {
        return dziekan;
    }

    public String getInfo(){
        return super.getInfo()+ " Dziekan: %s".formatted(dziekan);
    }
}
