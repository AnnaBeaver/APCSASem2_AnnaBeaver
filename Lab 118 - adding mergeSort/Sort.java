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
        int swapCounter = 0;
        int compareCounter = 0;
        //traverse the array
        for(int n = 0; n < list.length; n++){
            //traverse the array again
            for(int a = 1; a < list.length; a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the next value in the array
                compareCounter++;
                if(list[a] < list[a-1]){
                    //set temporary variables equal to the original values in the array
                    int i = list[a];
                    int j =list[a-1];

                    //switch the values in  the array by setting them equal to the other value 
                    //from the top bit of this if statement
                    list[a-1] = i;
                    list[a] = j;

                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void bubbleSort(int list[]){
        int swapCounter = 0;
        int compareCounter = 0;
        //traverse the array
        //making it go from last to first maked the limit
        for(int n = list.length; n >0; n--){
            //traverse the array again
            for(int a = 0; a < list.length-1; a++){
                //if the current value is smaller than the value of the one to it's right
                compareCounter++;
                if(list[a]>list[a+1]){
                    //swap them
                    int x = list[a+1];
                    list[a+1] = list[a];
                    list[a]=x;

                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void insertionSort(int list[]){
        //create a temporary variable
        int test;
        int swapCounter = 0;
        int compareCounter = 0;
        //traverse the array starting at 1
        for(int n = 1; n < list.length; n++){
            //traverse the array starting at the end
            for(int a = n; a > 0; a--){
                //if the current value is greater than the one to its left
                compareCounter++;
                if(list[a] < list[a-1]){
                    //swap them
                    test = list[a];
                    list[a] = list[a-1];
                    list[a-1] = test;

                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void selectionSort(int list[]){
        int swapCounter = 0;
        int compareCounter = 0;
        for(int n = 0; n < list.length; n++){
            for(int a = 0; a < list.length; a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the value after it in the array
                compareCounter++;
                if(list[n] < list[a]){
                    int x = list[n];
                    list[n] = list[a];
                    list[a]=x;

                    swapCounter++;
                }
            }
        }
        System.out.println("Swap Counter = " + swapCounter);
        System.out.println("Compare Counter = " + compareCounter);
    }

    public static void mergeSort(int[]list, int length){
        if(length<2){
            return;
        }  //Base Case
        int midpoint = length/2;
        int[]leftList = new int[midpoint];
        int[] rightList = new int[length-midpoint];
        
        for(int i = 0; i<midpoint; i++){
            leftList[i] = list[i];
        }

        for(int i = midpoint; i<length; i++){
            rightList[i-midpoint]=list[i];
        }
        mergeSort(leftList,midpoint);
        mergeSort(rightList,length-midpoint);
        merge(list,leftList,rightList);
    }
    
    public static void merge(int[]list, int[]leftA, int[] rightA){
        int i = 0, j=0, k=0;
        while(i<leftA.length && j<rightA.length){
            if(leftA[i] <= rightA[j]){
                list[k++] = leftA[i++];
            }
            else{
                list[k++] = rightA[j++];
            }
        }
        while(i < leftA.length){
            list[k++] = leftA[i++];
        }
        while(j < rightA.length){
            list[k++] = rightA[j++];
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
