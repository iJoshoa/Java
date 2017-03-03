
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author student
 */
class inw extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillRect(350, 25, 100, 10); //มง
        g.setColor(Color.GREEN);
        g.fillOval(350, 50, 100, 80);//หัว
        g.fillRect(400, 275, 25, 100);//ขาซ้าย
        g.fillRect(475, 275, 25, 100);//ขาขวา
        
        g.setColor(Color.BLACK);
        g.fillOval(350, 50, 20, 20);//ตาซ้าย
        g.fillOval(425, 50, 20, 20);//ตาขวา
        g.fillOval(390, 80, 5 , 5);//จมูกซ้าย
        g.fillOval(400, 80, 5 , 5);//จมูกขวา
        g.drawLine(350, 100, 450, 100);
        g.setColor(Color.ORANGE);
        g.fillOval(350, 100, 200, 200);//กระดอง
        g.setColor(Color.BLACK);
        g.drawLine(375, 135, 425 , 175);
        g.drawLine(425, 175, 480 , 175);
        g.drawLine(480, 175, 525 , 135);
        g.drawLine(425, 175, 425, 225);
        g.drawLine(425, 225, 375, 265);
        g.drawLine(425, 225, 480 , 225);
        g.drawLine(480, 225, 525, 265);
        g.drawLine(480, 225, 480, 175);
        g.setColor(Color.GREEN);
        g.fillRect(375, 150, 25, 100);//แขน
        g.setColor(Color.red);
        g.fillRect(225, 240, 300, 10);//กระบอง
        g.setColor(Color.BLUE);
        g.fillOval(370, 225, 30, 30);
        
    }
}
class frame extends JFrame{
    frame(){
        this.setTitle("inw");
        inw k = new inw();
        this.add(k);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class Lab7As2 {
    public static void main(String[] args) {
        new frame();
    }
}
