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
    public long getId(){
        return id;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getMiejscowosc(){
        return miejscowosc;
    }
    public long getPesel(){
        return pesel;
    }

    public String toString() {
        return "Id: %d, Imie: %s, Nazwisko: %s, Pesel: %d".formatted(id, imie, nazwisko, pesel);
    }
}
