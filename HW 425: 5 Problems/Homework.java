import java.util.ArrayList;
import java.lang.*;
/**
 * 5 homework problems in Lab 425
 */
public class Homework
{
    //Instance Variables

    //Constructor
    public Homework(){   
    }

    //Methods
    //Problem 1
    public Integer findMissing(ArrayList<Integer> arr1){
        int sum = 0;
        for(int i = 0; i< arr1.size(); i++){
            sum += i;
        }
        return 5050-sum;
    }
    
    //Problem 2
    public int findSum(int[]a1, int[] a2, int targ){
        int a1closest=0;
        int a2closest=0;
        for(int a = 0; a < a1.length; a++){
            for(int b = 0; b<a2.length; b++){
                if(java.lang.Math.abs(targ - (a1[a] + a2[b])) < java.lang.Math.abs(targ - (a1closest + a2closest))){
                    a1[a] = a1closest;
                    a2[b] = a2closest;
                }
            }
        }
        return a1closest + a2closest;
    }
    
    //Problem 3
    public String findFirstRepeating(String letters){
        String returnString = "";
        for(int i = 0; i<letters.length(); i++){
            for(int j = i+1; j<letters.length(); j++){
                if(letters.charAt(i) == letters.charAt(j)){
                    returnString = returnString + letters.charAt(i);
                }
            }
        }
        return returnString;
    }
    
    //Problem 4
    public ArrayList<Integer> findIntersection(int[]a1, int[]a2, int[]a3){
        ArrayList <Integer> returnArrayList = new ArrayList <Integer>();
        for(int a = 0; a<a1.length; a++){
            for(int b = a; b<a2.length; b++){
                for(int c = b; c<a3.length; c++){
                if(a1[a] == a2[b] && a1[a] == a3[c]){
                    returnArrayList.add(a1[a]);
                }
            }
            }
        }
        return returnArrayList;
    }
    
    //Problem 5
    public int[][] flipDiagonal(int[][] Mat){
        int[][] Tam = new int [Mat.length][Mat[0].length];
        for(int x = 0; x<Mat.length; x++){
            for(int y = 0; y<Mat[x].length; y++){
                Mat[x][y] = Tam [y][x];
            }
        }
        return Tam;
    }
}
