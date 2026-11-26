public class LogischeOperatoren {
    public static void main(String[] args) {

        double kaufpreis = 18000;
        double rabatt;

        if (kaufpreis < 15000) {
            rabatt = 0;
        } else if (kaufpreis <= 20000) {
            rabatt = 5;
        } else if (kaufpreis < 25000) {
            rabatt = 7;
        } else {
            rabatt = 8.5;
        }

        System.out.println("Rabatt: " + rabatt + "%");
    }
}