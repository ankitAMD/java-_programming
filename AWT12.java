import java.awt.*;
import java.awt.event.*;                    //  wap to know which fonts are available in a local systems
class Fonts    
{                          
    public static void main(String[] args)
    {
    	GraphicsEnvironment ge=
    	GraphicsEnvironment.getLocalGraphicsEnvironment();
    	String fonts[] =ge.getAvailableFontFamilyNames();
    	System.out.println("Available fonts on this System: ");

    	for(int i=0; i<fonts.length; i++)
    	System.out.println(fonts[i]);                    

    }
}