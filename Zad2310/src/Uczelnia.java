public class Uczelnia extends Nauczyciel {

    private String nazwa;
    private String opis;

    public Uczelnia(long id, String miejscowosc, String nazwa, String opis) {
        super(id, miejscowosc);
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public Uczelnia(long id, String nazwa, String opis){
        super(id);
        this.nazwa=nazwa;
        this.opis=opis;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public String toString() {
        return super.toStringId() + super.toStringMiejscowosc() + ", Nazwa: %s, Opis: %s".formatted(nazwa,opis);
    }

    public String nazwatoString(){
        return ", Nazwa: %s".formatted(nazwa);
    }

    public String opistoString(){
        return ", Opis: %s".formatted(opis);
    }
}
