import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (m): ");
        double height = input.nextDouble();

        // Parentheses ensure height * height is evaluated before the division
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        input.close();
    }
}
