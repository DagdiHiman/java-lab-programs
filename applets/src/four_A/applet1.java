package four_A;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class applet1 extends Applet implements KeyListener {
	TextField t1=new TextField();
	public void init() {
		this.setLayout(null);
		t1.addKeyListener(this);
		t1.setBounds(0,20,100,20);
		this.add(t1);
	}

	public void keyTyped(KeyEvent k) {
		if(k.getKeyChar()=='p') {
			//showStatus(Character.toString(k.getKeyChar()));
			String palin=(t1.getText());
			String rev=new StringBuilder(palin).reverse().toString();
			if(palin.equals(rev)) showStatus(palin+" is a Palindrome");
			else	showStatus(palin+" is Not a plaindrome");
		}
	}
	public void keyPressed(KeyEvent k) {}
	public void keyReleased(KeyEvent e) {}

}