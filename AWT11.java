import java.awt.*;
import java.awt.event.*;                    //  wap to display some text in the frame using drawString() method.
class Message extends Frame    
{                          
	Message()
	{                                                           
		addWindowListener(new WindowAdapter()            // close the frame when close button clicked
		{
			 public void windowClosing(WindowEvent e)
	        {
		        System.exit(0);
	        } 
		});
	} // end of constructor

    public void paint(Graphics g)                            
    {
     this.setBackground(new Color(100,20,20)); 
     Font f =new Font("Arial", Font.BOLD+Font.ITALIC,30);
     g.setFont(f);

     g.setColor(Color.green);
     g.drawString("Hello,How are U",100,100);
   }

    public static void main(String[] args)
    {
    	Message p = new Message();                       // create the frame
    	p.setSize(500,400);                      //set the size and title                       
    	p.setTitle("This is my Text");
    	p.setVisible(true);                           // display the frame
    }
}