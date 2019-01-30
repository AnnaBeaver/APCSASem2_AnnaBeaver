
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    String catchphrase = "Catchphrase";
    int speed;
    public void setCatchphrase(String value){
        catchphrase = value;
    }
    public void getCatchphrase(){
        System.out.println(catchphrase);
    }
    public void setSpeed(int value){
        speed = value;
    }
    public void getSpeed(){
        System.out.println(speed);
    }
}
