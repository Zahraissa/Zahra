/**
 * Write a description of class Room here.
 *
 * @author (ZAHRA ISSA KHAMIS  BITA/6/22/052/TZ)
 * @version (TEST 1 : QUESTION NO:1)
 */
public class room
{
  private double width;
  private double length;
  private int floor;
  
  public room (){
    width = 10;
    length = 12.5;
    floor = 1;
    }
     public void setwidth(double width){
       if (width >0)
       {this.width=width;}
    }
    public double getwidth()
    {return width;}
  
    public void setlength(double length){
        if (length>0)
        {this.length = length;}
    }
    
      public double getlength(){
        return length;
    }
    public void setfloor(int floor){
    this.floor= floor;
    }
    public int getfloor(){
        return floor;
    }
    public room (double width,double length,int floor){
    setwidth(width);
    setlength(length);
    setfloor(floor);
    }
}
