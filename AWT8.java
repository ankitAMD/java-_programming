import java.awt.*;
import java.awt.event.*;
class 	DrawPoly extends Frame                               //  program to create a polygon that is filled withgreen color. This polygon must be created inside  a rounded rectangle is filled with redcolor.
{
	DrawPoly()
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
     g.setColor(Color.red);                              //set red color for drawing
     g.fillRoundRect(30,30,250,250,30,30);                            //display a rect to contain drawing
     g.setColor(Color.green);  
     int x[] ={40,200,40,100};
     int y[] ={40,40,200,200};                           //take x and y cordinates in arrays 
     int num=4;                                         // there are 4 pairs of x,y cooordinates
     g.fillPolygon(x,y,num);
 }
    public static void main(String[] args)
    {
    	DrawPoly d = new DrawPoly();                       // create the frame
    	d.setSize(400,400);                           //set the size and title
    	d.setTitle("My drawing");
    	d.setVisible(true);                           // display the frame
    }
}