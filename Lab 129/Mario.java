
/**
 * Write a description of class Mario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mario extends Character
{
    String catchphrase = "It's me, Mario";
    public void setSpeed(int value){
        super.setSpeed(value*2);
    }
    public void setCatchphrase(String catchphrase){
        super.setCatchphrase(catchphrase);
    }
}
