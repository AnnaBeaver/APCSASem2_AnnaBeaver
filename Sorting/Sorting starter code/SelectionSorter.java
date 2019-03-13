
/**
 * Write a description of class SelectionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSorter extends Sorter
{
    public void sort(int[] list){
        for(int n = 0; less(n, list.length); n++){
            for(int a = 0; less(a, list.length-1); a++){
                /** by traversing the array twice, I can compare every value to every other value */
                //if the original value is greater than the value after it in the array
                if(less(list[n], list[a])){
                    swap(list, n, a);
                    /*
                    //swap them
                    int x = list[n];
                    list[n] = list[a];
                    list[a]=x;
                    */
                }
            }
        }
    }
}
