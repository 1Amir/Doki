package Overtext;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class store extends JPanel implements ActionListener,KeyListener{
	public Image stores;
	public int x = 0;
	public int y = 0;
	private Image Jake;
	private Image Chris;
	public Image Audrey;
	public void frame(){
		store open = new store();
		JFrame frame = new JFrame();
		frame.setSize(300,300);
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.getContentPane().add(open);
		frame.setVisible(true);
		frame.setResizable(true);
	}
	public void paintComponent(Graphics a){
		super.paintComponent(a);
		ImageIcon ii = new ImageIcon(this.getClass().getResource("store.gif"));
		ImageIcon ia = new ImageIcon(this.getClass().getResource(""));
;		stores = ii.getImage();
	    int bx = 500;
		int by = 500;
	    Graphics2D g2g = (Graphics2D)a;
	    g2g.drawImage(stores, 0, 0,this);
	    g2g.drawImage(Jake, x, y,this);


	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_A){
			ImageIcon ia = new ImageIcon(this.getClass().getResource(""));
			Jake = ia.getImage();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		ImageIcon is = new ImageIcon(this.getClass().getResource(""));
		Jake = is.getImage();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
