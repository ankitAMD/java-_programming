import java.awt.*;
import java.awt.event.*;
class 	Draw1 extends Frame                               // draw a smiling face in a frame
{
	Draw1()
	{                                                           
		this.addWindowListener(new WindowAdapter()            // close the frame

		{
			 public void windowClosing(WindowEvent e)
	        {
		        System.exit(0);
	        } 
		});
	}
    public void paint(Graphics g)                            //to refresh the same contents
    {
     g.setColor(Color.red);                              //set blue color for drawing
     g.drawRect(40,40,200,200);                             // draw a rectangle to contain drawing 
     g.drawOval(90,70,80,80);                                //face
     g.drawOval(110,95,5,5);                               //eyes
     g.drawOval(145,95,5,5);
     g.drawLine(130,95,130,115);                           //nose
     g.drawArc(113,115,35,20,0,-180);                      //mouth

    } 

    public static void main(String[] args)
    {
    	Draw1 d = new Draw1();                       // create the frame
    	d.setSize(400,400);                           //set the size and title
    	d.setTitle("My drawing");
    	d.setVisible(true);                           // display the frame
    }
}