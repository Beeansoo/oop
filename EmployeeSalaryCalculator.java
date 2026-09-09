import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();

        double grossSalary = hoursWorked * hourlyRate;

        System.out.println("Gross Salary: PHP " + grossSalary);

        input.close();
    }
}
