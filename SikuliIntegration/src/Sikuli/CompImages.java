package Sikuli;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CompImages {
	
	public static void main(String args[]){
	BufferedImage imgA = ImageIO.read(new File("C:/Users/lenovo/Desktop/IMG_20171124_144728 - Copy.jpg")); 
    BufferedImage imgB = ImageIO.read(new File("C:/Users/lenovo/Desktop/IMG_20171124_144728.jpg"));   

    String bufferedImagesEqual( imgA, imgB);
    
}
}