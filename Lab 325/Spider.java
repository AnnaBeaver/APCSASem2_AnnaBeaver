
/**
 * Write a description of class Spider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spider implements Animal
{
   public int legs(){
        return 8;
    }
    
    public int height(){
        return(int) Math.random()*3;
    } 
    public String name(){
        return "Spider";
    }
}
