import java.util.Scanner;

/**
 * Write a description of class TaxCalculator here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 1: NO: 4)
 */
public class TaxCalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the actual value of the property: $");
        double actualValue = scanner.nextDouble();
        System.out.print("Enter the tax rate for each $100.00 of assessed value: $");
        double taxRate = scanner.nextDouble();
        double assessedValue = 0.6 * actualValue;
        double annualPropertyTax = (assessedValue / 100) * taxRate;
        System.out.printf("The annual property tax for a property valued at $%.2f is $%.2f.%n", actualValue, annualPropertyTax);
        scanner.close();
    }
}
