import java.util.Scanner;
/**
 * Write a description of class Quiz here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 2: NO:5)
 */
public class Quiz
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quiz score: ");
        int quizScore = scanner.nextInt();
        char grade;
        if (quizScore == 5) {
            grade = 'A';
        } else if (quizScore == 4) {
            grade = 'B';
        } else if (quizScore == 3) {
            grade = 'C';
        } else if (quizScore == 2) {
            grade = 'D';
        } else if (quizScore == 1 || quizScore == 0) {
            grade = 'F';
        } else {
            grade='E';
        }
        System.out.println("The corresponding grade is: " +grade );
        scanner.close();
    }
}
