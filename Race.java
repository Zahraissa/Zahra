import java.util.Scanner;
/**
 * Write a description of class Race here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 2: NO:4)
 */
public class Race
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] runnerNames = new String[3];
        double[] runnerTimes = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of runner " + (i + 1) + ": ");
            runnerNames[i] = scanner.nextLine();
            System.out.print("Enter the finishing time (in minutes) for " + runnerNames[i] + ": ");
            runnerTimes[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (runnerTimes[j] > runnerTimes[j + 1]) {
                    String tempName = runnerNames[j];
                    runnerNames[j] = runnerNames[j + 1];
                    runnerNames[j + 1] = tempName;
                    double tempTime = runnerTimes[j];
                    runnerTimes[j] = runnerTimes[j + 1];
                    runnerTimes[j + 1] = tempTime;
                }
            }
        }

        System.out.println("\nRace Results:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + runnerNames[i]);
        }
        scanner.close();
    }
}
