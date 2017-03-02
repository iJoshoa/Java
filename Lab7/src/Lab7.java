/**
 *
 * @author $_F
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Buttonnaja extends JButton implements ActionListener{
private String title1;
private String title2;
private int toggle;
Buttonnaja(String title1,String title2){
this.setText(title1);
this.title1 = title1;
this.title2 = title2;
int toggle = 1;
this.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
if(toggle==0){
this.setText(title1);
this.toggle = 1;
}
else{
this.setText(title2);
this.toggle = 0;
}
}
}
class kitty extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.PINK);
        g.fillOval(350, 50, 100, 80);
        g.setColor(Color.BLACK);
        g.drawLine(350, 125, 375, 100);
    }
}
class framenaja extends JFrame implements MouseListener{
Buttonnaja b;
JLabel lb;
framenaja(){
b = new Buttonnaja("Rav Kung","Jak kung");
lb = new JLabel("test");
  kitty k=new kitty();
this.add(lb);
this.add(k);
this.addMouseListener(this);
this.setSize(800,600);
this.setLayout(new FlowLayout());
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
@Override
public void mouseClicked(MouseEvent e) {
}
@Override
public void mousePressed(MouseEvent e) {
}
@Override
public void mouseReleased(MouseEvent e) {
int x = e.getX();
int y = e.getY();
lb.setText(String.valueOf(x)+","+String.valueOf(y));
}
@Override
public void mouseEntered(MouseEvent e) {
}
@Override
public void mouseExited(MouseEvent e) {
}
}

public class Lab7 {
    public static void main(String[] args) {
        new framenaja();
    }
}
