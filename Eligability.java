import java.util.*;
/**
 * Write a description of class Eligability here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 2: NO:1)
 */
public class Eligability
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter years of citizenship: ");
        int yearsOfCitizenship = scanner.nextInt();
        boolean senateEligible = age >= 30 && yearsOfCitizenship >= 9;
        boolean houseEligible = age >= 25 && yearsOfCitizenship >= 7;      
        System.out.println("Senate Eligibility: " + (senateEligible ? "Eligible" : "Not Eligible"));
        System.out.println("House Eligibility: " + (houseEligible ? "Eligible" : "Not Eligible"));
    }
}
