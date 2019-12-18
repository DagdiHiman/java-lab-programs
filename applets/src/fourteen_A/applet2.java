package fourteen_A;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.applet.Applet.*;
import java.lang.*;
public class applet2 extends Applet implements MouseListener, MouseMotionListener{

int x=0,y=0,a=0,b=0,startx=0,starty=0;

public void init() {
addMouseListener(this);
addMouseMotionListener(this);
}

public void paint(Graphics g) {
g.drawRect(x,y , b, a);
}

@Override
public void mouseDragged(MouseEvent arg0) {
// TODO Auto-generated method stub
x=startx;
y=starty;
a = (arg0.getX()-x);
b = (arg0.getY()-y);
if(a<0)
{
x=arg0.getX();
y=arg0.getY();
a=Math.abs(a);
}
if(b<0)
{
x=arg0.getX();
y=arg0.getY();
b=Math.abs(b);
}
repaint();
}

@Override
public void mouseMoved(MouseEvent arg0) {
// TODO Auto-generated method stub

}

@Override
public void mouseClicked(MouseEvent arg0) {
// TODO Auto-generated method stub

}

@Override
public void mouseEntered(MouseEvent arg0) {
// TODO Auto-generated method stub

}

@Override
public void mouseExited(MouseEvent arg0) {
// TODO Auto-generated method stub

}

@Override
public void mousePressed(MouseEvent arg0)
{
// TODO Auto-generated method stub
startx = arg0.getX();
starty = arg0.getY();
}

@Override
public void mouseReleased(MouseEvent arg0) {
// TODO Auto-generated method stub

}

}

