import java.awt.*;
import java.awt.event.*;
class 	Draw2 extends Frame                               // draw a smiling face in a frame
{
	Draw2()
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
     g.setColor(Color.blue);                              //set blue color for drawing
     g.fillRect(40,40,200,200);                            //display a rect to contain drawing
     g.setColor(Color.yellow);  
     g.drawOval(90,70,80,80);                                //face
     g.setColor(Color.black);                             // set black color
     g.fillOval(110,95,5,5);                               //eyes
     g.fillOval(145,95,5,5);
     g.drawLine(130,95,130,115);                           //nose
     g.setColor(Color.red);                             // set color red
     g.drawArc(113,115,35,20,0,-180);                      //mouth
     
     
 
 }
    public static void main(String[] args)
    {
    	Draw2 d = new Draw2();                       // create the frame
    	d.setSize(400,400);                           //set the size and title
    	d.setTitle("My drawing");
    	d.setVisible(true);                           // display the frame
    }
}