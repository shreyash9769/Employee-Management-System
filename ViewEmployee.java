//Your package

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewEmployee extends JavaOop implements ActionListener {
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;
    static int v=0;

    public ViewEmployee(){
        f=new JFrame("View Employee");
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,768,457);
        l1.setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Add path of your img here"));
        Image image=i1.getImage().getScaledInstance(768,457,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(image);
        l1.setIcon(i2);
        f.add(l1);

        label(l1,l2,"Employee ID",50,40,180,40,Font.BOLD,30);

        t1=new JTextField();
        t1.setBounds(250,45,100,30);
        l1.add(t1);

        b1=button(l1,b1,"Search",50,120,100,30);
        b1.addActionListener(this);
        b2=button(l1,b2,"Cancel",250,120,100,30);
        b2.addActionListener(this);

        f.setLocation(100,50);
        f.setSize(768,457);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String s=t1.getText();
        if(actionEvent.getSource()==b1){
            f.setVisible(false);
            PrintDetails p=new PrintDetails(t1.getText());
        }
        if (actionEvent.getSource()==b2){
            f.setVisible(false);
            v=1;
            Details d=new Details();
        }
    }
//    public static void main(String[] args){
//        ViewEmployee viewEmployee=new ViewEmployee();
//    }
}
