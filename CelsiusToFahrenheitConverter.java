import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Celsius temperature: ");
        double celsius = input.nextDouble();

        // 9.0 and 5.0 are used (not 9 and 5) to force decimal division
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);

        input.close();
    }
}
