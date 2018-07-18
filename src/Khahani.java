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

        if (price <= 500) {
            discount = price * 10 / 100;    // 10% off
        } else if (price > 500 && price < 1000) {
            discount = price * 20 / 100;    // 20% off
        } else {
            discount = price / 2;           // 50% off
        }

        int mustPay = price - discount;

        System.out.println("Invoice information:");
        System.out.println("Price: " + price);
        System.out.println("discount: " + discount);
        System.out.println("Payment: " + mustPay);
        System.out.println("********************");
        System.out.println("Be my guest");

        /*
            Seller decided based on the number of time that
            customers came to his shop give them various gift
         */

        System.out.println("\n\n One more thing...");
        int shoppingCount = 1;

        switch (shoppingCount) {
            case 1:
                System.out.println("This is first time that you shop from our store");
                System.out.println("Here your gift card. It offer you 20% off in next shopping.");
                break;
            case 2:
                System.out.println("It's nice to see you again.");
                System.out.println("Here your golden card. Our delivery service is free for you.");
                break;
            default:
                System.out.println("it's my honor to have unique customer like you.");
                System.out.println("Here your VIP card. Every thing here is free for you and your family !!!!");
                System.out.println(":DDDD");
                break;
        }
    }
}
