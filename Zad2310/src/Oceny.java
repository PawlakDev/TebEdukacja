public class Oceny extends Nauczyciel{
    private int ocena;
    private String komentarz;

    public Oceny(long id, int ocena, String komentarz){
        super(id);
        this.ocena=ocena;
        this.komentarz=komentarz;
    }

    public String toString(){
        return super.toStringId() + ", Ocena: %d, Komentarz: %s ".formatted(ocena,komentarz);
    }
}
