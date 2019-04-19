import java.util.ArrayList;
/**
 * 
 */
public class Digits
{
    //Instance Variables
    private ArrayList <Integer> digitList;
    
    //Constructor
    public Digits(int num){
        //Part a
        int temp = num;
        while(temp<10){
            digitList.add(temp%10);
            temp = temp/10;
        }
        digitList.add(num);
    }

    
    //Methods
    public boolean isStrictlyIncreasing(){
        boolean tested = true;
        for(int i = 0; i<digitList.size(); i++){
            if(digitList.get(i-1)>digitList.get(i)){
                tested = false;
            }
        }
        return tested;
    }
    
    
}
