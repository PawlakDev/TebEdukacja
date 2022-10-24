public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Goldi", "Labrador");
        System.out.println("Imie psa to: " + dog.getImie());
        System.out.println("Rasa psa to: " + dog.getRasa());
        dog.setImie("Goldi2");
        System.out.println("Imie psa to: " + dog.getImie());
    }
}
