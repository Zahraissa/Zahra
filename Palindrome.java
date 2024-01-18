import java.util.Scanner;
/**
 * Write a description of class Palindrome here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 2: NO: 2)
 */
public class Palindrome
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        int length = strNumber.length();
        for (int i = 0; i < length / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
