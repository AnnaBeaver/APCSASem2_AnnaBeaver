import java.util.*;
/**
 * Write a description of class Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
    public static void bubbleSort(ArrayList <Animal> list){
        //traverse the array
        //making it go from last to first making the limit
        for(int n = list.size(); n >0; n--){
            //traverse the array again
            for(int a = 0; a < list.size()-1; a++){
                //if the current value is smaller than the value of the one to it's left
                if(list.get(a).legs() > list.get(a+1).legs()){
                    //swap them
                    Animal x = list.get(a+1);
                    list.set(a, list.get(a+1));
                    list.set(a+1, x);
                }
            }
            }
        }
}
