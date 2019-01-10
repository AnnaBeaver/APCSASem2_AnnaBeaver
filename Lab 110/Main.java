
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
        Sort.sort(list);
        Sort.print(list);
    }
}
