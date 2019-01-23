import java.util.*;
/**
 * Homework assignment for January 9, 2019
 * Create a sorting algorithm for a list of numbers
 * Anna Beaver
 */
public class Sort
{
    //setting up the array with random values
    public static void setUp(ArrayList <Integer> list){
        //setting the array up
        for(int y = 0; y <= 7;y++){
            //sets each value of the array to a random integer between 1 and 10
            list.add ((int) (Math.random()*10)+1);
        }
    }

    //sorting the array so that the smallest numbers are first
    public static void mySort(ArrayList <Integer> list){
        int swapCounter = 0;
        int compareCounter = 0;
        //traverse the array
        for(int n = 0; n < list.size(); n++){
            //traverse the array again
            for(int a = 1; a < list.size(); a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the next value in the array
                compareCounter++;
                if(list.get(a) < list.get(a-1)){
                    //set temporary variables equal to the original values in the array
                    int i = list.get(a);
                    int j =list.get(a-1);

                    //switch the values in  the array by setting them equal to the other value 
                    //from the top bit of this if statement
                    list.set(a-1,i);
                    list.set(a,j);
                    
                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void bubbleSort(ArrayList <Integer> list){
        int swapCounter = 0;
        int compareCounter = 0;
        //traverse the array
        //making it go from last to first maked the limit
        for(int n = list.size(); n >0; n--){
            //traverse the array again
            for(int a = 0; a < list.size()-1; a++){
                //if the current value is smaller than the value of the one to it's right
                compareCounter++;
                if(list.get(a)>list.get(a+1)){
                    //swap them
                    int x = list.get(a+1);
                    int y = list.get(a);
                    list.set(a+1,y);
                    list.set(a,x);
                    
                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void insertionSort(ArrayList <Integer> list){
        //create a temporary variable
        int test;
        int swapCounter = 0;
        int compareCounter = 0;
        //traverse the array starting at 1
        for(int n = 1; n < list.size(); n++){
            //traverse the array starting at the end
            for(int a = n; a > 0; a--){
                //if the current value is greater than the one to its left
                compareCounter++;
                if(list.get(a) < list.get(a-1)){
                    //swap them
                    test = list.get(a);
                    int test2 = list.get(a-1);
                    list.set(a,test2);
                    list.set(a-1,test);
                    
                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void selectionSort(ArrayList <Integer> list){
        int swapCounter = 0;
        int compareCounter = 0;
        for(int n = 0; n < list.size(); n++){
            for(int a = 0; a < list.size(); a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the value after it in the array
                compareCounter++;
                if(list.get(n) < list.get(a)){
                    int x = list.get(n);
                    list.set(n,list.get(a) );
                    list.set(a,x);
                    
                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }
    
    public static void mergeSort(ArrayList <Integer> list, int length){
        if(length<2){
            return;
        }  //Base Case
        int midpoint = length/2;
        ArrayList <Integer> leftList = new ArrayList <Integer> (midpoint);
        ArrayList <Integer> rightList = new ArrayList <Integer> (length-midpoint);
        
        for(int i = 0; i<midpoint; i++){
            leftList.get(i) = list.get(i);
        }

        for(int i = midpoint; i<length; i++){
            rightList.get(i-midpoint)=list.get(i);
        }
        mergeSort(leftList,midpoint);
        mergeSort(rightList,length-midpoint);
        merge(list,leftList,rightList);
    }
    
    public static void merge(ArrayList <Integer> list, ArrayList <Integer> leftA, ArrayList <Integer>rightA){
        int i = 0, j=0, k=0;
        while(i<leftA.size() && j<rightA.size()){
            if(leftA.get(i) <= rightA.get(j)){
                list.set(k++) = leftA[i++];
            }
            else{
                list[k++] = rightA[j++];
            }
        }
        while(i < leftA.size()){
            list.set(k++) = leftA.get(j++);
        }
        while(j < rightA.size()){
            list.set(k++) = rightA.get(j++);
        }
    }
    //printing each value of the array on its own line
    public static void print(ArrayList <Integer> list){
        //traverse the array
        for(int x = 0; x<list.size(); x++){
            //print each value of the array
            System.out.println(list.get(x));
        }
    }

    public static long startTimer(){
        long start = System.nanoTime();
        return start;
    }

    public static long endTimer(){
        long end = System.nanoTime();
        return end;
    }

    public static void displayTime(long start, long end){
        long display = end-start;
        System.out.print("Time = " + display);
    }

    public static int swapCounter(){
        int count = 0;

        return count;
    }
}
