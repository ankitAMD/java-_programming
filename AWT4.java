import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame                               // create a frame than closes  using WindowAdapter class
{
	
     public static void main(String[] args)
     {
     MyFrame f = new MyFrame();                   // create a Frame with title
     f.setTitle("My AWT Frame");                    // set a title for the frame
     f.setSize(300,250);                          // set the size of the frame
     f.setVisible(true);                         // display the frame
     f.addWindowListener(new MyClass());        // close the frame 
     }

}

class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}