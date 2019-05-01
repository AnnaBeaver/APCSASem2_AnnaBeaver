
/**
 * Part b
 */
public class GameDriver{
    //Instance Variables
    private GameState state;
    //Constructor
    public GameDriver(GameState intial){
        state = initial;
    }

    //Methods
    public void play(){
        while(GameState.isGameOver() == false){
            System.out.println GameState.getCurrentPlayer() + ": " GameState.getNextMove());
        }
        
        if(getWinner == null){
            System.out.println("The game ends in a draw");
        }
        else{
            System.out.println(GameState.getWinner() + " wins");
        }
    }
}
