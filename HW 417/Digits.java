import java.util.ArrayList;
/**
 * Part a: 4/5, forgot to construct digitList
 * 
 */
public class Digits
{
    //Instance Variables
    private ArrayList <Integer> digitList;
    
    //Constructor
    public Digits(int num){
        //Part a
        digitList = new ArrayList <Integer>();//missed point, constructs digitList
        int temp = num;
        while(temp >= 10){
            digitList.add(0,temp%10);//+1 identified A digit in num
            //+1 Adds at least one digit to the list
            //+1 adds all digits to a list
            temp = temp/10;
        }
        digitList.add(0,temp);
    }
    //+1 on exit, digitList contains all digits in the right order

    
    //Methods
    public boolean isStrictlyIncreasing(){
        //Part b
        boolean tested = true;
        for(int i = 1; i<digitList.size(); i++){
            if(digitList.get(i-1) >= digitList.get(i)){
                //+1 compares at least one set of consecutive digits in digitList
                tested = false;
            }
        }
        return tested;
    }
    
    
}
