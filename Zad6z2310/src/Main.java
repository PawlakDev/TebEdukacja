public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Politechnika_Sw politechnika = new Politechnika_Sw(1L, "cos", "cos2", "cos3", "cos4");
        UJK ujk = new UJK(2L, "cos5", "cos6", "cos7", "cos8");
        System.out.println(politechnika.getInfo());
        System.out.println(ujk.getInfo());
    }
}