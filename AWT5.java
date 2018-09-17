import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame                               // create a frame than closes  using Anonymous inner class
{
	
    public static void main(String[] args)
    {
     MyFrame f = new MyFrame();                   // create a Frame with title
     f.setTitle("My AWT Frame");                    // set a title for the frame
     f.setSize(300,250);                          // set the size of the frame
     f.setVisible(true);                         // display the frame
     f.addWindowListener(new WindowAdapter()       // close the frame ,Here Myclass name is not mentioned but its object is passed to the method
        {
           public void windowClosing(WindowEvent e)
	        {
		        System.exit(0);
	        } 

        });

    }

}