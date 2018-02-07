package windowFrame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class ImageInOut {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = scan.nextLine();
		String fileOutName = scan.nextLine();
		scan.close();
		BufferedImage x = null;
		try {
			x = loadFile(fileName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	public static BufferedImage loadFile(String fileName) {
		BufferedImage pic = null;
		try{
			File fIn = new File(fileName);
			pic = ImageIO.read(fIn);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return pic;
	}
	public void paintFile(BufferedImage pic) {
		try {
			Window frame = new Window();
			
		}catch() {
			
		}
	}
	public void saveFile(String fileName, BufferedImage pic) {
		try {
			File fOut = new File(fileName);
			ImageIO.write(pic, "png", fOut);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
