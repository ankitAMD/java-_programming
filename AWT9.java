import java.awt.*;
import java.awt.event.*;
class 	Home extends Frame    
{                          // wap to draw a home with moon in the background
	Home()
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
     
     int x[] ={375,275,475};                             // store x, y coordinates in x[] and y[]
     int y[] ={125,200,200};  
     int n=3;      // no. of pairs                         
     this.setBackground(Color.gray);            // Set gray background for frame
     g.setColor(Color.yellow);
     g.fillRect(300,200,150,100);                // set yellow color for rectangle -house
     g.setColor(Color.blue);
     g.fillRect(350,210,50,60);                // set yellow color for another rectangle -door
     g.drawLine(350,280,400,280);        //draw a line below the door
     g.setColor(Color.darkGray);
     g.fillPolygon(x,y, n);                // set darkGray color for polygon -roof
     g.setColor(Color.cyan);
     g.fillOval(100,100,60,60);                // set  cyan color for oval -moon
     g.setColor(Color.green);
     g.fillArc(50,250,150,100,0,180);          //set greeen from arcs  - grass
     g.fillArc(150,250,150,100,0,180);
     g.fillArc(450,250,150,100,0,180);

     g.drawLine(50,300,600,300);               // draw a line - thebottom most line of drawing
     g.drawString("My happy home",275,300);       //display some texr

    }
 
    public static void main(String[] args)
    {
    	Home h = new Home();                       // create the frame
    	h.setSize(500,400);                           //set the size and title
    	h.setTitle("My 	Home");
    	h.setVisible(true);                           // display the frame
    }
}