/**
 * Write a description of class roomTest here.
 *
 * @author (ZAHRA ISSA KHAMIS)
 * @version (TEST 1 : QUESTION NO :1)
 */
public class roomTest
{
    public static void main(String[] args)
    {
       room defaultroom = new room();
       System.out.println("default room:" +defaultroom);
       room customroom = new room(15.0,8.0,2);
       System.out.println("custom room:" +customroom);
    }
}
