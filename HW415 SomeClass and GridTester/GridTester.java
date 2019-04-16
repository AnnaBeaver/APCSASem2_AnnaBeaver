
/**
 * Anna Beaver
 * Question 5 on CW 415
 */
public class GridTester{
    //Instance Variables
    private int rows;
    private int cols;
    private int[][] grid;
    
    //Constructor
    public GridTester(int r, int c)
    {
        // initialise instance variables
        r = rows;
        c = cols;
        
    }

    //Methods
    public void loadOccupied(){
        for(int r = 0; r< rows; r++){//traversing rows
            for(int c = 0; c<cols; c++){//traversing cols
                int shuffler = (int) (Math.random()*3)+1;
                if(shuffler == 3){
                    //grid(r,c) = true;
                }
            }
        }
    }
}
