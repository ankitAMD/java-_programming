import java.awt.*;
class MyFrame extends Frame                               // create a frame by creating an object to the subclass of Frame class.
{
	MyFrame(String str)
	{
		super(str);                                       // call super class constructor to store title 
	}
     public static void main(String[] args)
     {
     MyFrame f = new MyFrame("My AWT frame");   // create a Frame with title
     f.setSize(300,250);                    // set the size of the frame
     f.setVisible(true);                    // display the frame
     }

}