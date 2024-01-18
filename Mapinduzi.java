
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (ZAHRA ISSA KHAMIS BITA/6/22/052/TZ)
 * @version (TEST 1 QUESTION NO:3)
 */
public class Mapinduzi
{
    private String Name;
    private int day;
    private String Month;
    public Mapinduzi (String Name,int day,String Month)
    {
        this.Name=Name;
        this.day=day;
        this.Month=Month;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setday(int day)
    {
        this.day=day;
    }
    public int getday()
    {
        return day;
    }
    public void setMonth(String Month)
    {
        this.Month=Month;
    }
    public String getMonth()
    {
        return Month;
    }
}
