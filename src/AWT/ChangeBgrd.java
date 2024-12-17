//program to click a button and change the background color
package AWT;
import java.awt.*;
import java.awt.event.*;

class FrameChangeBgrd extends Frame implements ActionListener{
    FrameChangeBgrd(){
        this.setSize(700,700);
        this.setTitle("Change The BackGround");
        this.setVisible(true);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 270));
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Button b1 = new Button("COLOR 1");
        Button b2 = new Button("COLOR 2");
        Button b3 = new Button("COLOR 3");
        b1.setPreferredSize(new Dimension(120, 70));
        b2.setPreferredSize(new Dimension(120, 70));
        b3.setPreferredSize(new Dimension(120, 70));
        b1.setBackground(new Color(0xf72585));
        b2.setBackground(new Color(0x7209b7));
        b3.setBackground(new Color(0x4cc9f0));
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String val = e.getActionCommand();
        if(val.equals("COLOR 1")){
            this.setBackground(new Color(0xf72585));
        }
        else if(val.equals("COLOR 2")){
            this.setBackground(new Color(0x7209b7));
        }
        else if(val.equals("COLOR 3")){
            this.setBackground(new Color(0x4cc9f0));
        }
    }
}
public class ChangeBgrd {
    public static void main(String[] args) {
        FrameChangeBgrd fm = new FrameChangeBgrd();
    }
}
