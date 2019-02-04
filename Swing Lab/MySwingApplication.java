import javax.swing.*;
public class MySwingApplication implements Runnable 
{
    JFrame jFrame;//Activity 1a #7
    CanvasComponent canvasComponent = new CanvasComponent(300,100);
    public void run(){
        jFrame = new JFrame("First Window");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
        
    }
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
