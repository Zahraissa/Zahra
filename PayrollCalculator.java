import java.util.Scanner;
/**
 * Write a description of class PayrollCalculator here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 2: NO;3)
 */
public class PayrollCalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's ID number: ");
        int idNumber = scanner.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter number of hours worked for the week: ");
        double totalHours = scanner.nextDouble();
        double regularHours = Math.min(totalHours, 40);
        double overtimeHours = Math.max(totalHours - 40, 0);
        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * 1.5 * hourlyRate;
        double grossPay = regularPay + overtimePay;
        double incomeTaxRate = 0.15;
        double parkingCharge = 20.0;
        double deductions = (grossPay > 500.0) ? (incomeTaxRate * grossPay) + parkingCharge : parkingCharge;
        double netPay = grossPay - deductions;
        System.out.println("ID Number:\t" + idNumber);
        System.out.println("Pay Rate:\t" + hourlyRate);
        System.out.println("Regular Hours:\t" + regularHours);
        System.out.println("Overtime Hours:\t" + overtimeHours);
        System.out.println("Total Hours:\t" + totalHours);
        System.out.println("Regular Pay:\t" + regularPay);
        System.out.println("Overtime Pay:\t" + overtimePay);
        System.out.println("Gross Pay:\t" + grossPay);
        System.out.println("Deductions:\t" + deductions);
        System.out.println("Net Pay:\t" + netPay);
    }
}
