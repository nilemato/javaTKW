public class Main {
    public static void main(String[] args) {

        double price = 20;
        double tax = 0.2;
        int quantity = 10;
        double total = 0;

        total = (price * quantity) + (price * quantity * tax);

        String message = "I want to buy " + quantity + " shirt!";

        System.out.println(message);
        System.out.println("Total cost with tax is: " + total);
    }
}