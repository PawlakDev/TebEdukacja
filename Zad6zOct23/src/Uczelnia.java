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
        return this.id;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public String getMiejscowość() {
        return this.miejscowość;
    }

    public String getOpis() {
        return this.opis;
    }

    public String getInfo() {
        return "Id: %d, Nazwa: %s, Miejscowosc: %s, Opis: %s".formatted(this.id, this.nazwa, this.miejscowość, this.opis);
    }
}