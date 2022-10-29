public class Uczelnia {
    private long id;
    private String nazwa;
    private String miejscowość;
    private String opis;

    public Uczelnia(long id, String nazwa, String miejscowość, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowość = miejscowość;
        this.opis = opis;
    }

    public long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getMiejscowość() {
        return miejscowość;
    }

    public String getOpis() {
        return opis;
    }

    public String getInfo(){
        return "Id: %d, Nazwa: %s, Miejscowosc: %s, Opis: %s".formatted(id, nazwa, miejscowość, opis);
    }
}
