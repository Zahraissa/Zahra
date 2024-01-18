import java.util.Scanner;
/**
 * Write a description of class sumpossitiveno here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 3 :NO :4)
 */
public class sumpossitiveno
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter positive numbers (enter a negative number to end):");
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break; 
            }
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}
