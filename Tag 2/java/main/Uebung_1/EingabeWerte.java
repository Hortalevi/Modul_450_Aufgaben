public class EingabeWerte {

    public static double berechneRabatt(double kaufpreis) {

        if (kaufpreis < 15000) {
            return 0;
        } else if (kaufpreis <= 20000) {
            return 5;
        } else if (kaufpreis < 25000) {
            return 7;
        } else {
            return 8.5;
        }
    }

    public static void main(String[] args) {

        System.out.println(berechneRabatt(10000) == 0);
        System.out.println(berechneRabatt(14999) == 0);
        System.out.println(berechneRabatt(15000) == 5);
        System.out.println(berechneRabatt(15001) == 5);
        System.out.println(berechneRabatt(20000) == 5);
        System.out.println(berechneRabatt(20001) == 7);
        System.out.println(berechneRabatt(24999) == 7);
        System.out.println(berechneRabatt(25000) == 8.5);
        System.out.println(berechneRabatt(25001) == 8.5);
        System.out.println(berechneRabatt(30000) == 8.5);
    }
}