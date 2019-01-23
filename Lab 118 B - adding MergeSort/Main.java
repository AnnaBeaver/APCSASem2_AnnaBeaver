//import java.lang.System.nanoTime();
import java.lang.*;
import java.util.*;
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
        ArrayList <Integer> list1 = new ArrayList<Integer>();
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
        ArrayList <Integer> list2 = new ArrayList<Integer>();
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
        ArrayList <Integer> list3 = new ArrayList<Integer>();
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
        ArrayList <Integer> list4 = new ArrayList<Integer>();
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
        ArrayList <Integer> list5 = new ArrayList<Integer>();
        Sort.setUp(list5);
        long start5 = Sort.startTimer();
        Sort.mergeSort(list5,7);
        long end5 = Sort.endTimer();
        Sort.displayTime(start5, end5);
        Sort.print(list5);
        System.out.println();
        System.out.println();
        
    }
}  

