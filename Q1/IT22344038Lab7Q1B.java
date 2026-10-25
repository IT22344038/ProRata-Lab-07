
import java.util.Scanner;

public class IT22344038Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.print("Enter four subject marks for student "
                    + student + ": ");

            int total = 0;

            for (int subject = 1; subject <= 4; subject++) {
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
        }

        input.close();
    }
}
