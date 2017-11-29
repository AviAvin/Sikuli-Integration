package Sikuli;

import org.sikuli.script.FindFailed;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class DesktopAutomate {

	public static void main(String[] args) throws FindFailed {
		Screen screen=new Screen();
		Pattern p=new Pattern("C:/Users/lenovo/Desktop/IMG_2017112.png");
		screen.click(p);
    
	}

}
