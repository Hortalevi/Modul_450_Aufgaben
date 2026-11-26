public class Fehler {

    public static void main(String[] args) {
        // double baseprice = 100.0;
        // double specialprice = 50.0;
        // double extraprice = 5.0;
        // int extras = 0;
        // double discount = 2.0;
        // double result = calculatePrice(baseprice, specialprice, extraprice, extras, discount);
        boolean result = test_calculate_price();
        System.out.println(result);
    }

    public static double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount;
        double result;

        if (extras >= 3)
            addon_discount = 10;
        else if (extras >= 5)
            addon_discount = 15;
        else
            addon_discount = 0;

        if (discount > addon_discount)
            addon_discount = discount;

        result = baseprice/100.0 * (100-discount) + specialprice
                + extraprice/100.0 * (100-addon_discount);

        return result;
    }

    public static boolean test_calculate_price(){
        double price;
        boolean test_ok = true;

        price = calculatePrice(100.0, 50.0, 5.0, 5, 0.0);
        if (Math.abs(price - 154.25) > 0.0001) {
        }
        return test_ok;
    }
}
