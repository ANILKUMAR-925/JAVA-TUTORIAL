package AWT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FrameCalculator extends Frame implements ActionListener{
    FrameCalculator(){
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(e);
        this.setBackground(Color.RED);
    }
}
public class Calculator {
    public static void main(String[] args) {
        FrameCalculator fm = new FrameCalculator();
    }
}
