public class UJK extends Uczelnia {
    private String dziekan;

    public UJK(long id, String nazwa, String miejscowość, String opis, String dziekan) {
        super(id, nazwa, miejscowość, opis);
        this.dziekan = dziekan;
    }

    public String getDziekan() {
        return this.dziekan;
    }

    public String getInfo() {
        String var10000 = super.getInfo();
        return var10000 + " Dziekan: %s".formatted(this.dziekan);
    }
}