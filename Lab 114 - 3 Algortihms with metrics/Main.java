
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(){
        int[] list = new int[7];
        
        
        Sort.setUp(list);
        Sort.mySort(list);
        Sort.print(list);
        System.out.println();
        
        Sort.setUp(list);
        Sort.bubbleSort(list);
        Sort.print(list);
        System.out.println();
        
        Sort.setUp(list);
        Sort.insertionSort(list);
        Sort.print(list);
        System.out.println();
        
        Sort.setUp(list);
        Sort.selectionSort(list);
        Sort.print(list);
    }
}
