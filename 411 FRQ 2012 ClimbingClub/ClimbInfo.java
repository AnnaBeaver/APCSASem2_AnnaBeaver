//import java.util.ArrayList;
/**
 * Write a description of class ClimbInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    //Instance Variables
    private String Name;
    private int Time;
    
    //Constructor
    public ClimbInfo(String peakName, int climbTime){
        Name = peakName;
        Time = climbTime;
    }

    // Methods
    public String getName(){
        return Name;
    }
    
    public int getTime(){
        return Time;
    }
    
}
