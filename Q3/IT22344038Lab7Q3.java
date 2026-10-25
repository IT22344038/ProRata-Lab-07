
import java.util.Scanner;

public class IT22344038Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter bill amount for customer "
                    + i + ": ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char payment = Character.toUpperCase(
                    input.next().charAt(0));

            if (payment == 'C') {
                double discount = bill * 0.05;
                double amount = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to pay: " + amount);

            } else if (payment == 'O') {
                System.out.println("Discount: 0.0");
                System.out.println("Amount to pay: " + bill);

            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}
