
import java.util.Scanner;

public class IT22344038Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += input.nextInt();
        }

        double average = total / 4.0;

        System.out.println("Average: " + average);

        if (average >= 75) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50) {
            System.out.println("Grade: Credit");
        } else {
            System.out.println("Grade: Fail");
        }

        input.close();
    }
}
