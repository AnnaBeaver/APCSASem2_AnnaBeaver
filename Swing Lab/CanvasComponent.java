import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener implements MouseMotionListener{
    int xPosition;
    int yPosition;
    int width;
    int height;
    CanvasComponent(int width, int height){
        this.xPosition = 0;
        this.yPosition = 0;
        this.width = width;
        this.height = height;
    }
    
    //Activity 2 #4
    protected void paintComponent(Graphics G){
        G.setColor(Color.blue);
        G.fillRect(xPosition, yPosition, width, height);
        
    }
}
