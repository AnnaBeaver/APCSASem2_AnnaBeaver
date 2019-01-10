
/**
 * Homework assignment for January 9, 2019
 * Create a sorting algorithm for a list of numbers
 * Anna Beaver
 */
public class Sort
{
    //setting up the array with random values
    public static void setUp(int list[]){
        //setting the array up
        for(int y = 0; y<list.length;y++){
            //sets each value of the array to a random integer between 1 and 10
            list[y] = (int) (Math.random()*10)+1;
        }
    }
    
    //sorting the array so that the smallest numbers are first
    public static void mySort(int list[]){
        //traverse the array
        for(int n = 0; n < list.length; n++){
            //traverse the array again
            for(int a = 0; a < list.length-1; a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the value after it in the array
                if(list[a] > list[a+1]){
                    //set temporary variables equal to the original values in the array
                    int i = list[a];
                    int j = list[a+1];

                    //switch the values in  the array by setting them equal to the other value 
                    //from the top bit of this if statement
                    list[a+1] = i;
                    list[a] = j;
                }
            }
        }
    }
    
    public static void bubbleSort(int list[]){
        //traverse the array
        for(int n = list.length; n >0; n--){
            //traverse the array again
            for(int a = 0; a < list.length-1; a++){
                
                if(list[a]>list[a+1]){
                    int x = list[a+1];
                    list[a+1] = list[a];
                    list[a]=x;
                }
            }
            }
        }
    
    
    public static void selectionSort(int list[]){
        //traverse the array
        for(int n = list.length; n >0; n--){
            //traverse the array again
            for(int a = 0; a < list.length-1; a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the value after it in the array
                if(list[a] > list[a+1]){
                    //set temporary variables equal to the original values in the array
                    int i = list[a];
                    int j = list[a+1];

                    //switch the values in  the array by setting them equal to the other value 
                    //from the top bit of this if statement
                    list[a+1] = i;
                    list[a] = j;
                }
            }
        }
    }
    
    //printing each value of the array on its own line
    public static void print(int list[]){
        //traverse the array
        for(int x = 0; x<list.length; x++){
            //print each value of the array
            System.out.println(list[x]);
        }
    }
}
