
/**
 * Write a description of class Position here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Position
{
    //Instance Variables
    int row;
    int col;
    private Digits[][] intArr = new Digits[5][5];
    //Constructor
    public Position(int r, int c){
        row = r;
        col = c;
    }

    //Methods
    public static Position findPosition(int num, int[][] intArr){
        for(int r = 0; r<intArr.length; r++){
            for(int c = 0; c<intArr[r].length; c++){
                if(intArr[r][c] == num){
                    return Position(r,c);
                }
            }
        }
    }
}
