import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener{
    int xPosition;
    int yPosition;
    int width;
    int height;
    int mouseFromX;
    int mouseFromY;
    boolean shapeSelected;
    int animationDeltaX;
    int animationDeltaY;
    int gutterX;
    int gutterY;
    CanvasComponent(int width, int height){
        this.xPosition = 0;
        this.yPosition = 0;
        this.width = width;
        this.height = height;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.animationDeltaX = 0;
        this.animationDeltaY = 0;
        this.gutterX = 10;
        this.gutterY = 10;
    }

    //Activity 2 #4
    protected void paintComponent(Graphics G){
        G.setColor(Color.blue);
        G.fillRect(xPosition, yPosition, width, height);

    }

    /**_______________________________MOUSE LISTENER______________________________________*/
    public  void mouseClicked(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed and released.
    }

    public void mousePressed(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed.
        int xValue = e.getX();
        mouseFromX = xValue;
        int yValue = e.getY();
        mouseFromY = yValue;
        if(mouseFromX > xPosition && mouseFromX < xPosition+width && mouseFromY > yPosition && mouseFromY < yPosition+height){
            shapeSelected = true;
        }
    }

    public void mouseReleased(MouseEvent e){
        //This method is called by Swing when a mouse button is released.
    }

    public void mouseEntered(MouseEvent e){
        //This method is called by Swing when the cursor moves inside the bounding box of
        //the component that defines the MouseListener interface.
    }

    public void mouseExited(MouseEvent e){
        //This method is called by Swing when the cursor moves outside the bounding box of
        //the component that defines the MouseListener interface.�
    }

    
    /**____________________________MOUSE MOTION LISTENER__________________________________*/
    public void mouseDragged(MouseEvent e){
        //This method is called by Swing when a mouse button is pressed and then the mouse
        //is moved with the button depressed.
        if(shapeSelected == true){
            //getting the location of the mouse
            int mouseToX = e.getX();
            int mouseToY = e.getY();
            
            //moving the rectangle to follow the mouse
            xPosition = xPosition + (mouseToX-xPosition);
            yPosition = yPosition + (mouseToY-yPosition);
            
            
            mouseToX = e.getX();
            mouseToY = e.getY();
            this.repaint();
        }
    }

    public void mouseMoved(MouseEvent e){
        //This method is called by Swing when the mouse is moved without any button
        //depressed.
    }
    
    /**________________________________ACTION LISTENER__________________________________*/
    public void actionPerformed(ActionEvent e){
        //Invoked when an action occurs. actionPerformed is called by a timer object at
        //regular intervals determined by the delay parameter to the constructor.
        Dimension componentSizeDimention = this.getSize();
        
    }
}
