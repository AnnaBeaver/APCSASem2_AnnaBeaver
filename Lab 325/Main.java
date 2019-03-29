import java.util.*;
public class Main
{
    public static void main(){
        ArrayList <Animal> list = new ArrayList <Animal> (10);
        for(int i = 0; i< list.size(); i++){
            int choice = (int) Math.random()*2;
            if(choice == 0){
               Giraffe giraffe = new Giraffe();
               list.set(i,giraffe); 
            }
            if(choice == 1){
               Spider spider = new Spider();
               list.set(i,spider); 
            }
            System.out.println(list.get(i).legs());
        }
        Sort.bubbleSort(list);
        for(int c = 0; c<list.size(); c++){
            System.out.println(list.get(c).name() + " " + list.get(c).legs());
        }
    }
}
