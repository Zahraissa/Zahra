import java.util.Scanner;
/**
 * Write a description of class largestandsmallno here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 3: NO:6)
 */
public class largestandsmallno
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter an integer (enter 99 to finish): ");
            int number = scanner.nextInt();
            if (number == 99) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
