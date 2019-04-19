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
        //Part a
        for(int r = 0; r<intArr.length; r++){
            for(int c = 0; c<intArr[r].length; c++){
                if(intArr[r][c] == num){
                    return new Position(r,c);
                }
            }
        }
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][]intArr){
        //Part b
        Position[][]newArr = new Position[intArr.length][intArr[0].length];
        for(int row = 0; row<intArr.length; row++){
            for(int col = 0; col<intArr[0].length; col++){
                newArr[row][col] = findPosition(intArr[row][col]+1,intArr);
            }
        }
        return newArr;
    }
}
