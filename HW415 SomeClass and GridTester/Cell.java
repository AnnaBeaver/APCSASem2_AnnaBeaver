import java.util.ArrayList;
/**
 * Write a description of class Cell here.
 * Anna Beaver
 * Part 2 of Problem 5 on CW 415
 */
public class Cell
{
    //Instance Variables
    private boolean occupied;
    int id;
    ArrayList<Cell> neighbors = new ArrayList <Cell>();
    
    //Constructor
    public Cell(boolean o, int i){
        o = occupied;
        i = id;
    }

    //Methods
    public void loadNeighbors(){
        
    }
}
