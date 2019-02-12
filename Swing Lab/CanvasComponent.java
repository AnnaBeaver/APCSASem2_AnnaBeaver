import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener{
    int xPosition;
    int yPosition;
    int width;
    int height;
    int mouseFromX;
    int mouseFromY;
    int mouseToX;
    int mouseToY;
    boolean shapeSelected = false;
    int animationDeltaX = 1;
    int animationDeltaY = 0;
    int gutterX;
    int gutterY;
    Timer animationTimer;

    //Constructor
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
        animationTimer = new Timer(20, this);
        this.animationTimer.start();
        int motionSpeed = 1;
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
        else{
            shapeSelected = false;
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

            //rechecking mouse position
            mouseToX = e.getX();
            mouseToY = e.getY();
            this.repaint();
        }
        else{
            mouseToX = e.getX();
            mouseToY = e.getY();
            
            animationDeltaX = (this.mouseToX - xPosition)/50;
            animationDeltaY = (this.mouseToY - yPosition)/50;
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
        Dimension componentSizeDimension = this.getSize();

        //If the new right side of your shape plus gutterX exceeds the
        //component width then update animationDeltaX and
        //animationDeltaY so that your shape starts moving down. Set
        //rectX to its maximum value(component width – rectWidth
        //– gutterX). Increment rectY by the new animationDeltaY.

        //Right Wall
        if(xPosition + width + gutterX > componentSizeDimension.width){
            animationDeltaX = 0;
            animationDeltaY = 1;
            xPosition += animationDeltaX;
            yPosition += animationDeltaY;
        }

        //Bottom Wall
        if(yPosition + height + gutterY > componentSizeDimension.height){
            animationDeltaX = -1;
            animationDeltaY = 0;
            xPosition += animationDeltaX;
            yPosition += animationDeltaY;
        }

        //Left Wall
        if(xPosition <  gutterX){
            animationDeltaX = 0;
            animationDeltaY = -1;
            xPosition += animationDeltaX;
            yPosition += animationDeltaY;
        }

        //Top Wall
        if(yPosition < gutterY){
            animationDeltaX = 1;
            animationDeltaY = 0;
            xPosition += animationDeltaX;
            yPosition += animationDeltaY;
        }

        else{
            xPosition += animationDeltaX;
            yPosition += animationDeltaY;
        }

        this.repaint();

    }

    /**________________________KEY LISTENER____________________________________*/

    public void keyTyped(KeyEvent e){
        //Invoked when a key has been typed. Implementing this method is usually enough
        //for most applications, and it will be for ours
    }

    public void keyPressed(KeyEvent e){
        //Invoked when a key has been pressed. You will leave the implementation of this
        //empty.
    }

    public void keyReleased(KeyEvent e){
        //Invoked when a key has been released. You will leave the implementation of this
        //empty.
    }

}