public class Nauczyciel {
    private long id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private long pesel;

    public Nauczyciel(long id, String imie, String nazwisko, String miejscowosc, long pesel) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.pesel = pesel;
    }

    public Nauczyciel(long id, String miejscowosc) {
        this.id = id;
        this.miejscowosc = miejscowosc;
    }

    public Nauczyciel(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String getMiejscowosc() {
        return this.miejscowosc;
    }

    public long getPesel() {
        return this.pesel;
    }

    public String toString() {
        return "Id: %d, Imie: %s, Nazwisko: %s, Pesel: %d".formatted(id,imie,nazwisko,pesel);
    }

    public String toStringId(){
        return "Id: %d".formatted(id);
    }
    public String toStringMiejscowosc(){
        return ", Miejscowosc: %s".formatted(miejscowosc);
    }
}