public class Tervitus {
    public static String tervitusTekst;

    public static void tervita() {
        system.out.println(tervitusTekst);
    }

    public static void main(String[] args) {
        tervitusTekst = "tere";
        tervita();
    }
}
