public class Kierunek extends Uczelnia {
    private String opis;
    public Kierunek(long id, String nazwa, String opis) {
        super(id,nazwa,opis);
    }

    public String getOpis() {
        return opis;
    }

    public String toString(){
        return super.toStringId() + super.nazwatoString() + super.opistoString();
    }
}
