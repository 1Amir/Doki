package Overtext;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import javax.swing.JOptionPane;

public class startup{
	public static void main(String[] args) throws IOException, InterruptedException{
	String start = "";		
	start = JOptionPane.showInputDialog("R or V");
    if(start.equals("V")) {
		System.out.print("Loading...");
		Overtextv frames = new Overtextv();
		frames.frames();
    }
	}
}