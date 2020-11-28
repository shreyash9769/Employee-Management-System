package com.academy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Details extends JavaOop implements ActionListener {
    JFrame f;
    JLabel l1, l2;
    JButton b1,b2,b3,b4,b5;
    //static int det=0;

    public Details(){
        f=new JFrame("Employee Details");

        f.setLayout(null);
        l1=new JLabel();
        l1.setBounds(0,0,640,302);
        l1.setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/academy/icons/empDet.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        label(l1,l2,"Employee Details",470,20,200,40,Font.BOLD,20);

        b1=button(l1,b1,"Add",500,80,100,30);
        b1.addActionListener(this);
        b2=button(l1,b2,"View",500,120,100,30);
        b2.addActionListener(this);
        b3=button(l1,b3,"Update",500,160,100,30);
        b3.addActionListener(this);
        b4=button(l1,b4,"Delete",500,200,100,30);
        b4.addActionListener(this);
        b5=button(l1,b5,"Cancel",30,100,100,30);
        b5.addActionListener(this);

        f.setVisible(true);
        f.setSize(640,302);
        f.setLocation(450,200);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==b1){
            f.setVisible(false);
            new AddEmployee();
        }
        if(actionEvent.getSource()==b2){
            f.setVisible(false);
            new ViewEmployee();
        }
        if(actionEvent.getSource()==b3){
            f.setVisible(false);
            new SearchEmployee();
            //new UpdateEmployee("");
        }
        if(actionEvent.getSource()==b4){
            f.setVisible(false);
            new DeleteEmployee();
        }
        if(actionEvent.getSource()==b5){
            f.setVisible(false);
            //det=1;
        }
    }
//    public static void main(String[] args){
//        Details details=new Details();
//    }
}
