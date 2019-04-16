import java.util.ArrayList;
/**
 * Write a description of class SomeClass here.
 * Anna Beaver
 * Problem 4 on CW 415
 */
public class SomeClass
{
    // Instance Variables
    private ArrayList <String> names;

    //Constructor(s)
    public SomeClass(ArrayList <String> ALStrings){
        // initialise instance variables
        ALStrings = names;
    }

    //Methods
    public void sortStrings(ArrayList<String> names){
        /** Uses Insertion Sort */
        //create a temporary variable
        String test;
        //traverse the array starting at 1
        for(int n = 1; n < names.size(); n++){
            //traverse the array starting at the end
            for(int a = n; a > 0; a--){
                //if the current value is greater than the one to its left
                if(names.get(a).compareTo( names.get(a-1)) > 0){
                    //swap them
                    test = names.get(a);
                    String test2 = names.get(a-1);
                    names.set(a,test2);
                    names.set(a-1,test);
                }
            }
        }
    }
    
    public void shuffleStrings(ArrayList <String> names){
        for(int x = 0; x<names.size(); x++){
            int shuffler = (int) Math.random()*(names.size());
            names.add(shuffler, names.get(x));
        }
    }
    
    public void insertString (String word){
        for(int i = 0; i < names.size(); i++){
            if(word.compareTo(names.get(i)) > 0){
                names.add(i-1, word);
            }
        }
    }
    
}
