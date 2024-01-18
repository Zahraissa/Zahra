import java.util.Scanner;
/**
 * Write a description of class Multplication here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 3: NO:5)
 */
public class Multplication
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                int result = i * j;
                System.out.printf("%-6d", result);
            }
            System.out.println();
        }
    }
}