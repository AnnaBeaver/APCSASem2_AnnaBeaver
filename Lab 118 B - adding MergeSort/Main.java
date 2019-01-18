//import java.lang.System.nanoTime();
import java.lang.*;
    
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(){
        
        System.out.println();
        System.out.println("My Sort");
        int[] list1 = new int[7];
        Sort.setUp(list1);
        long start1 = Sort.startTimer();
        Sort.mySort(list1);
        long end1 = Sort.endTimer();
        Sort.displayTime(start1, end1);
        Sort.print(list1);
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("Bubble Sort");
        int[] list2 = new int[7];
        Sort.setUp(list2);
        long start2 = Sort.startTimer();
        Sort.bubbleSort(list2);
        long end2 = Sort.endTimer();
        Sort.displayTime(start2, end2);
        Sort.print(list2);
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("Insertion Sort");
        int[] list3 = new int[7];
        Sort.setUp(list3);
        long start3 = Sort.startTimer();
        Sort.insertionSort(list3);
        long end3 = Sort.endTimer();
        Sort.displayTime(start3, end3);
        Sort.print(list3);
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("Selection Sort");
        int[] list4 = new int[7];
        Sort.setUp(list4);
        long start4 = Sort.startTimer();
        Sort.selectionSort(list4);
        long end4 = Sort.endTimer();
        Sort.displayTime(start4, end4);
        Sort.print(list4);
        System.out.println();
        System.out.println();
        
        
        System.out.println();
        System.out.println("Merge Sort");
        int[] list5 = new int[7];
        Sort.setUp(list5);
        long start5 = Sort.startTimer();
        Sort.mergeSort(list5, 7);
        long end5 = Sort.endTimer();
        Sort.displayTime(start5, end5);
        Sort.print(list4);
        System.out.println();
        System.out.println();
    }
}  

