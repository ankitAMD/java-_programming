import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame                               // create a frame than closes it on clicking the close button
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

class MyClass implements WindowListener 
{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}