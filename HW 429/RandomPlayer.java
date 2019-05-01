
/**
 * Part a
 */
public class RandomPlayer extends Player{
    //Instance Variables
    private String name = "";
    //Constructor
    public RandomPlayer(String aName){
        name = aName;
    }

    //Methods
    public String getName(){
        return name;
    }
    
    public String getNextMove(GameState state){
        return getCurrentMoves.get(Math.random()*getCurrentMoves.size());
    }
    
}
