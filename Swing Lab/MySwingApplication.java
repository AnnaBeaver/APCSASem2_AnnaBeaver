import javax.swing.*;
public class MySwingApplication implements Runnable 
{
    JFrame jFrame;// = new JFrame(); //Activity 1a #7
    public void run(){
        jFrame = new JFrame("First Window");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}
