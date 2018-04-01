package Overtext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Openworld extends Varibles implements ActionListener,KeyListener,MouseListener{
	
		Thread thread = new Thread();
	public void run() throws IOException,InterruptedException{

		Openworld open = new Openworld();
		JFrame frame = new JFrame();
		frame.setSize(1543,869);
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.getContentPane().add(open);
		frame.setVisible(true);
		frame.setResizable(true);
		
		
	//	Sound sound = new Sound();
	//	sound.staticsound();
    	
	}
public void stop() {
	    start = true;
}
	public Openworld() throws IOException{
		addKeyListener(this);
	 	setFocusable(true);
    	setFocusTraversalKeysEnabled(false);
    	addMouseListener(this);
    	repaint();
    	boolean knowing = true;
    	System.out.println(x);
    	ImageIcon is = new ImageIcon(this.getClass().getResource("Startscreen.gif"));
	    backround = is.getImage();
	  	if(start == false) {
			final java.util.Timer t = new java.util.Timer();
	    	t.schedule(new TimerTask() {

	    	            @Override
	    	            public void run() {
	    	            	
	    	            	System.out.println("this");
	    	            	ImageIcon is = new ImageIcon(this.getClass().getResource("thought.gif"));
	    	   			    backround = is.getImage();
	    	   			    repaint();
	    	   			    backgroundcheck = 1;
	    	   			t.cancel();
	    	   			t.purge();	    	   				
	    	            }
	    	        }, 9000, 9000);
	    	}
    	
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
	    
	    	
		    Graphics2D g2g = (Graphics2D)g;
		    g2g.drawImage(backround,x,y,this);
		    Graphics2D g3g = (Graphics2D)g;
		    g3g.drawImage(intro,350,100,this);
		    Graphics2D g4g = (Graphics2D)g;
		    Graphics2D g5g = (Graphics2D)g;
		    g5g.drawImage(characterspeaking,20,350,this);
		    g4g.drawImage(textbox,200,650,this);
		    Graphics2D g6g = (Graphics2D)g;
		    g6g.drawImage(Chris,Chrisx,Chrisy,this);
		    Graphics2D g10g = (Graphics2D)g;
		    g6g.drawImage(Jake,Jakex,Jakey,this);
		    Graphics2D g8g = (Graphics2D)g;
		    g8g.drawImage(Earthchan,900,300,this);
		    Graphics2D g9g = (Graphics2D)g;
		    g4g.drawImage(characterspeaking3,580,250,this);
		    g4g.drawImage(characterspeaking2,20,250,this);
		    g5g.drawImage(textbox2,200,480,this);
		    Graphics2D g11g = (Graphics2D)g;
		    g11g.drawImage(cursor,cursorx,cursory,this);
		    Graphics2D g13g = (Graphics2D)g;
		    g11g.drawImage(sword,swordx,swordy,this);
		    
            
		  

	}
	
	

	@Override
	public void keyReleased(KeyEvent e) {
		int c = e.getKeyCode();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stu
		int c = e.getKeyCode();
	     if(attackphase == true) {
         
         }
	    if(c == KeyEvent.VK_P) {
	    	  ImageIcon ih = new ImageIcon(this.getClass().getResource("swordright.gif"));
			  sword = ih.getImage();
	    }
		if(c == KeyEvent.VK_A) {
			
			
		if(abilitytomove == true) {	
			Chrisx = Chrisx - 7;
			swordx = swordx - 7;
		    ImageIcon ib = new ImageIcon(this.getClass().getResource("Chrisleft.gif"));
		    Chris = ib.getImage();
		    ImageIcon ic = new ImageIcon(this.getClass().getResource("Jakeleft.png"));
		    Jake = ic.getImage();
			System.out.print("Chris's x value:");
			System.out.println(Chrisx);
			System.out.print("Chris's y value:");
			System.out.println(Chrisy);
			System.out.print("Jake's x value:");
			System.out.println(Jakex);
			System.out.print("Jake's y value:");
			System.out.println(Jakey);
		
		}
		}
		if(c == KeyEvent.VK_D) {		
			Chrisx = Chrisx + 7;
			swordx = swordx + 7;
			System.out.print("Chris's x value:");
			System.out.println(Chrisx);
			System.out.print("Chris's y value:");
			System.out.println(Chrisy);
			System.out.print("Jake's x value:");
			System.out.println(Jakex);
			System.out.print("Jake's y value:");
			System.out.println(Jakey);
		    ImageIcon ib = new ImageIcon(this.getClass().getResource("Jakestandingright.gif"));
		    Jake = ib.getImage();
		    ImageIcon ie = new ImageIcon(this.getClass().getResource("Chrisright.gif"));
		    Chris = ie.getImage();
		    ImageIcon ih = new ImageIcon(this.getClass().getResource("sword.gif"));
		    sword = ih.getImage();
		}
		if(c == KeyEvent.VK_W) {		
			Chrisy = Chrisy - 7;
			swordy = swordy - 7;
			System.out.print("Chris's x value:");
			System.out.println(Chrisx);
			System.out.print("Chris's y value:");
			System.out.println(Chrisy);
			System.out.print("Jake's x value:");
			System.out.println(Jakex);
			System.out.print("Jake's y value:");
			System.out.println(Jakey);
		    ImageIcon ie = new ImageIcon(this.getClass().getResource("Chrisstandingback.gif"));
		    Chris = ie.getImage();
		
		}
		if(c == KeyEvent.VK_S) {
			Chrisy = Chrisy + 7;
			swordy = swordy + 7;
			System.out.print("Chris's x value:");
			System.out.println(Chrisx);
			System.out.print("Chris's y value:");
			System.out.println(Chrisy);
			System.out.print("Jake's x value:");
			System.out.println(Jakex);
			System.out.print("Jake's y value:");
			System.out.println(Jakey);
			 ImageIcon ib = new ImageIcon(this.getClass().getResource("Chrisstandingfront.gif"));
			    Chris = ib.getImage();
		}
		
		if(c == KeyEvent.VK_ENTER) {
			if(attackphase == true) {
			if(choiceattack == 1) {
				JOptionPane.showMessageDialog(null, "You decided to attack.");
			}
			if(choiceattack == 2) {
				JOptionPane.showMessageDialog(null, "You could not run");
			}
			if(choiceattack == 0) {
				if(backpackthings == 0) {
					JOptionPane.showMessageDialog(null, "There is nothing inside your backpacks");
				}
				JOptionPane.showMessageDialog(null, "Your going for the items");
			}
			}
	        //earthchan interaction
		
			script = script + 1;
			backgroundcheck = backgroundcheck + 1;
			System.out.println(backgroundcheck);
			if(backgroundcheck == 2) {
				ImageIcon is = new ImageIcon(this.getClass().getResource("Intro story.jpg"));
			    backround = null;
			    intro= is.getImage();
			    
			}
			if(backgroundcheck == 3) {
				ImageIcon ia = new ImageIcon(this.getClass().getResource("grassland.jpg"));
			    backround = ia.getImage();
			    ImageIcon ib = new ImageIcon(this.getClass().getResource("Chrisstandingfront.gif"));
			    Chris = ib.getImage();
			    ImageIcon ic = new ImageIcon(this.getClass().getResource("Jakestandingfront.gif"));
			    Jake = ic.getImage();
			    ImageIcon id = new ImageIcon(this.getClass().getResource("earthchan.gif"));
			    Earthchan = id.getImage();
			    intro = null;
			    x = 1;
			    y = 1;
			}		
			
			if(script == 2) {
			textbox = null;
			characterspeaking = null;
			abilitytomove = true;
			}
		}		
}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseY = MouseInfo.getPointerInfo().getLocation().y;
	    mouseX = MouseInfo.getPointerInfo().getLocation().x;  
	    System.out.print("x:");
	    System.out.println(mouseX);
	    System.out.print("y:");
	    System.out.println(mouseY);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
		
	
	//this will most likely be used later
	//public void encounter1(){	
//	}
	


