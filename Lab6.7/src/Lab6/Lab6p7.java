package Lab6;

/**
 *
 * @author $_F
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Listener implements ActionListener
{
@Override
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}
class Framenaja extends JFrame{
private JButton b1;
private JButton b2;
Framenaja(String title,int width,int height){
this.setTitle(title);
this.setSize(width,height);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
b1 = new JButton("OK");
b1.addActionListener(new Listener(){
@Override
public void actionPerformed(ActionEvent e) {
b1.setText("naja");
}
});
b2 = new JButton("Cancel");
b2.addActionListener(new Listener());
this.add(b1);
this.add(b2);
this.setVisible(true);
}
}
public class Lab6p7 {
    public static void main(String[] args) {
Framenaja x = new Framenaja("Ravikung",800,600);
}
}
