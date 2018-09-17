import java.awt.*;
import java.awt.event.*;
class Points extends Frame    
{                          // wap to draw a home with moon in the background
	Points()
	{                                                           
		addWindowListener(new WindowAdapter()            // close the frame when close button clicked
		{
			 public void windowClosing(WindowEvent e)
	        {
		        System.exit(0);
	        } 
		});
	}

    public void paint(Graphics g)                            //to refresh the same contents
    {
      g.setColor(Color.white);
     
     for(;;) // diplays dats forever
     {                           // generate x,y coordinates randomly. Maximum 800 and 600 px
     int x = (int) (Math.random() * 400);                            
     int y = (int) (Math.random() * 800);
     g.drawLine(x,y,x,y);
     try{
     	Thread.sleep(20);
        }
     catch(InterruptedException ie)
        {    
        }
     } 
   }

    public static void main(String[] args)
    {
    	Points p = new Points();                       // create the frame
    	p.setSize(500,400);                      //set the size and title
    	p.setBackground(Color.red);                         
    	p.setTitle("Random dots");
    	p.setVisible(true);                           // display the frame
    }
}