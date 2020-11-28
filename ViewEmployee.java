package com.academy;

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
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/academy/icons/viewE.jpg"));
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




//public class ViewEmployee implements ActionListener {
//    JFrame f;
//    JLabel l1,l2;
//    JTextField t1;
//    JButton b1,b2;
//
//    public ViewEmployee(){
//        f=new JFrame("View Employee");
//        f.setLayout(null);
//
//        l1=new JLabel();
//        l1.setBounds(0,0,768,457);
//        l1.setLayout(null);
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/academy/icons/viewE.jpg"));
//        Image image=i1.getImage().getScaledInstance(768,457,Image.SCALE_DEFAULT);
//        ImageIcon i2=new ImageIcon(image);
//        l1.setIcon(i2);
//        f.add(l1);
//
//        l2=new JLabel("Employee ID");
//        l2.setBounds(50,40,180,40);
//        l2.setFont(new Font("serif",Font.BOLD,30));
//        l2.setForeground(Color.black);
//        l1.add(l2);
//
//        t1=new JTextField();
//        t1.setBounds(250,45,100,30);
//        l1.add(t1);
//
//        b1=new JButton("Search");
//        b1.setBounds(50,120,100,30);
//        b1.setFont(new Font("serif",Font.PLAIN,20));
//        b1.setBackground(Color.WHITE);
//        b1.setForeground(Color.BLACK);
//        b1.addActionListener(this);
//        l1.add(b1);
//
//        b2=new JButton("Cancel");
//        b2.setBounds(250,120,100,30);
//        b2.setFont(new Font("serif",Font.PLAIN,20));
//        b2.setBackground(Color.WHITE);
//        b2.setForeground(Color.BLACK);
//        b2.addActionListener(this);
//        l1.add(b2);
//
//        f.setLocation(100,50);
//        f.setSize(768,457);
//        f.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        String s=t1.getText();
//        if(actionEvent.getSource()==b1){
//            f.setVisible(false);
//            PrintDetails p=new PrintDetails(t1.getText());
//        }
//        if (actionEvent.getSource()==b2){
//            f.setVisible(false);
//            Details d=new Details();
//        }
//    }
//    public static void main(String[] args){
//        ViewEmployee viewEmployee=new ViewEmployee();
//    }
//}
