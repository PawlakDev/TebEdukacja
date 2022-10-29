public class Nauczyciel {
    private long id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private long pesel;

    public Nauczyciel(long id, String miejscowosc) {
        this.id = id;
        this.miejscowosc = miejscowosc;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String toString() {
        return "Id: %d, Imie: %s, Nazwisko: %s, Pesel: %d".formatted(id,imie,nazwisko,pesel);
    }

    public String toStringId(){
        return "Id: %d".formatted(id);
    }
    public String toStringMiejscowosc(){
        return "Miejscowosc: %d".formatted(miejscowosc);
    }
}