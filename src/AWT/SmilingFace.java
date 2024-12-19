//program to create a smiling face
package AWT;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameFace extends Frame{
    FrameFace(){
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(70,90,350,350);
        int[] x={245,230,260};
        int[] y={240,270,270};
        int n=3;
        g.setColor(Color.blue);
        g.fillPolygon(x,y,n);
        g.setColor(Color.black);
        g.fillOval(145,180,20,40);
        g.fillOval(325,180,20,40);
        g.drawArc(145,300,200,75, 0,-180);
    }
}
public class SmilingFace {
    public static void main(String[] args) {
        FrameFace fm = new FrameFace();
    }
}
