
/**
 * Homework assignment for January 9, 2019
 * Create a sorting algorithm for a list of numbers
 * Anna Beaver
 */
public class Sort
{
    
    public static void setUp(int list[]){
        //setting the array up
        for(int y = 0; y<list.length;y++){
            list[y] = (int) (Math.random()*10)+1;
        }
    }
    public static void sort(int list[]){
        for(int n = 0; n < list.length; n++){
            for(int a = 0; a < list.length-1; a++){
                if(list[a] > list[a+1]){
                    //set temporary variables equal to the 
                    //values in the array
                    int i = list[a];
                    int j = list[a+1];

                    //switch the values
                    list[a+1] = i;
                    list[a] = j;
                }

            }
        }
    }
    public static void print(int list[]){
        for(int x = 0; x<list.length; x++){
            System.out.println(list[x]);
        }
    }
}
