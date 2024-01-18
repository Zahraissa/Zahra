import java.util.Scanner;
/**
 * Write a description of class Reverseno here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 1: NO:1)
 */
public class Reverseno
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 2-digit integer (rightmost digit non-zero): ");
        int x = scanner.nextInt();
        if (x < 10 || x > 99 || x % 10 == 0) {
            System.out.println("Invalid input. Please enter a 2-digit integer with non-zero rightmost digit.");
        } else {
            int y = (x % 10) * 10 + (x / 10);
            System.out.println("Original number (x): " + x);
            System.out.println("Reversed number (y): " + y);
            System.out.println("Sum (x + y): " + (x + y));
        }
        scanner.close();
    }

}
