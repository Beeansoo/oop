import java.util.Scanner;

public class ShoppingBillWithVAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = price * quantity;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        System.out.println("Subtotal: PHP " + subtotal + "; VAT: PHP " + vat + "; Total: PHP " + total);

        input.close();
    }
}
