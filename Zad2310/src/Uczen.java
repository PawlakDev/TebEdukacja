public class Uczen extends Nauczyciel {

    private String klasa;

    public Uczen(long id, String imie, String nazwisko, String miejscowosc, long pesel,String klasa) {
        super(id,imie,nazwisko,miejscowosc,pesel);
        this.klasa = klasa;
    }
    public String getKlasa(){
        return klasa;
    }
    public String toString(){
        return super.toString() + " Klasa: %s ".formatted(klasa);
    }
}
