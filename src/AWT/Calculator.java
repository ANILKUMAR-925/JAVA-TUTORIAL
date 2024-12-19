package AWT;
import java.awt.*;
import java.awt.event.*;

class CalculatorFrame extends Frame implements ActionListener{
    int num1, num2,result;
    TextField t;
    String msg;
    char op;
    CalculatorFrame() {
        num1 = num2 = result = 0;
        msg = "";
        this.setSize(545, 700);
        this.setVisible(true);
        this.setBackground(new Color(0xFEC89A));
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        t = new TextField();
        t.setBounds(7, 27, 543, 100);
        t.setFont(new Font("arial",Font.PLAIN,40));
        t.setBackground(new Color(0xece4db));
        this.add(t);
        Font fb = new Font("arial",Font.PLAIN,30);
        Button sum = new Button("+");
        sum.setBackground(new Color(0xfec5bb));
        sum.setBounds(25,210,150,100);
        sum.setFont(fb);
//        sum.setForeground(new Color(0xff9f1c));
        sum.addActionListener(this);
        this.add(sum);
        Button sub = new Button("-");
        sub.setBackground(new Color(0xfec5bb));
        sub.setBounds(195,210,150,100);
        sub.setFont(fb);
//        sub.setForeground(new Color(0xff9f1c));
        sub.addActionListener(this);
        this.add(sub);
        Button mul = new Button("*");
        mul.setBackground(new Color(0xfec5bb));
        mul.setBounds(370,210,150,100);
        mul.setFont(fb);
//        mul.setForeground(new Color(0xff9f1c));
        mul.addActionListener(this);
        this.add(mul);
        Button div = new Button("/");
        div.setBackground(new Color(0xfec5bb));
        div.setBounds(25,325,150,100);
        div.setFont(fb);
//        div.setForeground(new Color(0xff9f1c));
        div.addActionListener(this);
        this.add(div);
        Button mod = new Button("%");
        mod.setBackground(new Color(0xfec5bb));
        mod.setBounds(195,325,150,100);
        mod.setFont(fb);
//        mod.setForeground(new Color(0xff9f1c));
        mod.addActionListener(this);
        this.add(mod);
        Button clr = new Button("CLEAR");
        clr.setBackground(new Color(0xfec5bb));
        clr.setBounds(370,325,150,100);
        clr.setFont(fb);
//        clr.setForeground(new Color(0xff9f1c));
        clr.addActionListener(this);
        this.add(clr);
        Button res = new Button("=");
        res.setBackground(new Color(0xfec5bb));
        res.setBounds(195,470,150,100);
        res.setFont(fb);
//        res.setForeground(new Color(0xff9f1c));
        res.addActionListener(this);
        this.add(res);
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("arial",Font.PLAIN,22);
        g.setFont(f);
        g.drawString(msg,15,160);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!msg.isEmpty()){
            msg = "";
            repaint();
        }
       if(e.getActionCommand().equals("+")){
            if(t.getText().isEmpty()){
                msg = msg+"Please Enter The First Number";
                repaint();
            }
            else{
                try{
                    num1 = Integer.parseInt(t.getText());
                    op = '+';
                    msg = msg+num1+op;
                    t.setText("");
                    repaint();
                }
                catch (Exception err) {
                    msg = msg + "Please Enter a valid integer";
                    repaint();
                }
            }
       }
        else if(e.getActionCommand().equals("-")){
            if(t.getText().isEmpty()){
                msg = msg+"Please Enter The First Number";
                repaint();
            }
            else{
                try{
                    num1 = Integer.parseInt(t.getText());
                    op = '-';
                    msg = msg+num1+op;
                    t.setText("");
                    repaint();
                }
                catch (Exception err) {
                    msg = msg + "Please Enter a valid integer";
                    repaint();
                }
            }
        }
        else if(e.getActionCommand().equals("*")){
            if(t.getText().isEmpty()){
                msg = msg+"Please Enter The First Number";
                repaint();
            }
            else{
                try{
                    num1 = Integer.parseInt(t.getText());
                    op = '*';
                    msg = msg+num1+op;
                    t.setText("");
                    repaint();
                }
                catch (Exception err) {
                    msg = msg + "Please Enter a valid integer";
                    repaint();
                }
            }
        }
        else if(e.getActionCommand().equals("/")){
            if(t.getText().isEmpty()){
                msg = msg+"Please Enter The First Number";
                repaint();
            }
            else{
                try{
                    num1 = Integer.parseInt(t.getText());
                    op = '/';
                    msg = msg+num1+op;
                    t.setText("");
                    repaint();
                }
                catch (Exception err) {
                    msg = msg + "Please Enter a valid integer";
                    repaint();
                }
            }
        }
        else if(e.getActionCommand().equals("%")){
            if(t.getText().isEmpty()){
                msg = msg+"Please Enter The First Number";
                repaint();
            }
            else{
                try{
                    num1 = Integer.parseInt(t.getText());
                    op = '%';
                    msg = msg+num1+op;
                    t.setText("");
                    repaint();
                }
                catch (Exception err) {
                    msg = msg + "Please Enter a valid integer";
                    repaint();
                }
            }
        }
       else if(e.getActionCommand().equals("CLEAR")){
          t.setText("");
          num1 = num2 = 0;
       }
       else if(e.getActionCommand().equals("=")){
           if(num1 == 0 && num2 == 0){
               msg = msg+"Please give the inputs";
               repaint();
           }
           else{
               try{
                   num2 = Integer.parseInt(t.getText());
                   if(op=='+'){
                       result = num1 + num2;
                       t.setText(num1+"+"+num2+"=" + result);
                   }
                   if(op=='-'){
                       result = num1 - num2;
                       t.setText(num1+"-"+num2+"=" + result);
                   }
                   if(op=='*'){
                       result = num1 * num2;
                       t.setText(num1+"*"+num2+"=" + result);
                   }
                   if(op=='/'){
                       try {
                           result = num1 / num2;
                           t.setText(num1+"/"+num2+"=" + result);
                       }
                       catch(Exception d){
                           msg += "reminder is zero";
                           repaint();
                       }
                   }
                   if(op=='%'){
                       result = num1 % num2;
                       t.setText(num1+"%"+num2+"=" + result);
                   }
               }
               catch (Exception err) {
                   msg = msg + "Please Enter a valid integer";
                   repaint();
               }
           }
       }
    }
}
public class Calculator {
    public static void main(String[] args) {
        CalculatorFrame fm = new CalculatorFrame();
    }
}
