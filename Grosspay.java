/**
 * Write a description of class Grosspay here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 1: NO:3)
 */
public class Grosspay
{
    public static void main(String[] args) {
        double annualSalary = 32500.0;
        int payPeriodsPerYearBiMonthly = 24;
        int payPeriodsPerYearBiWeekly = 26;
        double grossPayBiMonthly = calculateGrossPay(annualSalary, payPeriodsPerYearBiMonthly);
        double grossPayBiWeekly = calculateGrossPay(annualSalary, payPeriodsPerYearBiWeekly);
        System.out.println("Gross pay for bi-monthly payments: $" + grossPayBiMonthly);
        System.out.println("Gross pay for bi-weekly payments: $" + grossPayBiWeekly);
    }
    private static double calculateGrossPay(double annualSalary, int payPeriodsPerYear) {
        return annualSalary / payPeriodsPerYear;
    }
}
