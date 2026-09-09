import java.util.Scanner;

public class WeightedFinalGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quiz grade: ");
        double quiz = input.nextDouble();

        System.out.print("Enter project grade: ");
        double project = input.nextDouble();

        System.out.print("Enter exam grade: ");
        double exam = input.nextDouble();

        double finalGrade = (quiz * 0.30) + (project * 0.30) + (exam * 0.40);

        System.out.println("Final Grade: " + finalGrade);

        input.close();
    }
}
