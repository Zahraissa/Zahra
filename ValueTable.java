
/**
 * Write a description of class ValueTable here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (QUESTION 3: NO: 1)
 */
public class ValueTable
{
    public static void main(String[] args) {
        int N = 1;
        System.out.println("N\t10*N\t100*N\t1000*N");
        while (N <= 5) {
            int tenN = 10 * N;
            int hundredN = 100 * N;
            int thousandN = 1000 * N;
            System.out.println(N + "\t" + tenN + "\t" + hundredN + "\t" + thousandN);
            N++;
        }
    }
}
