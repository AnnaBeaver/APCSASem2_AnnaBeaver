
/**
 * FRQ 2012 #4 all parts
 */
public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    /**
     * Constructor for objects of class GrayImage
     */
    public GrayImage(){

    }

    //Methods
    //Part a
    public int countWhitePixels(){
        int counter = 0;
        for(int x = 0; x<pixelValues.length; x++){
            for(int y = 0; y<pixelValues[x].length; y++){
                if(pixelValues[x][y] == 255){
                    counter++;
                }
            }
        }
        return counter;
    }

    public void processImage(){
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 2; x++){
                if(y<2){
                    pixelValues[x][y] = pixelValues[x][y]-pixelValues[x+1][y];
                }
                else{
                    pixelValues[x][y] = pixelValues[x][y]-pixelValues[0][y+1];
                }
                if(pixelValues[x][y] <0){
                    pixelValues[x][y] = 0;
                }
            }
        }
    }
}
