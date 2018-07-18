/**
 * Developer and Teacher: Khahani.com
 * Course: Android 1
 */

/**
 * One seller based on product price decided to
 * get customer various discount.
 * Finally customer can see his/her invoice information.
 */
public class Khahani {
    public static void main(String[] args) {
        int price = 1200;
        int discount;

        if (price <= 500){
            discount = price * 10 / 100;    // 10% off
        }else if (price > 500 && price < 1000){
            discount = price * 20 / 100;    // 20% off
        }else {
            discount = price / 2;           // 50% off
        }

        int mustPay = price - discount;

        System.out.println("Invoice information:");
        System.out.println("Price: " + price);
        System.out.println("discount: " + discount);
        System.out.println("Payment: " + mustPay);
        System.out.println("********************");
        System.out.println("Be my guest");
    }
}
