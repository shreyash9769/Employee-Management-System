package com.academy;

import java.awt.event.*;
import javax.swing.*;

public class SearchEmployee extends JavaOop implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    public SearchEmployee(){
        f=new JFrame("search");
        f.setLayout(null);

        l=label(f,l,"Employee Id",60,50,250);
        l.setVisible(true);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        f.add(t);

        b=button(f,b,"Search",240,150,100,30);
        b.addActionListener(this);
        b2=button(f,b2,"Cancel",360,150,100,30);
        b2.addActionListener(this);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            Details d=new Details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            new UpdateEmployee(t.getText());

        }
    }

//    public static void main(String[]ar){
//        new SearchEmployee();
//    }
}




//public class SearchEmployee implements ActionListener{
//    JFrame f;
//    JTextField t;
//    JLabel l,l5;
//    JButton b,b2;
//
//    public SearchEmployee(){
//        f=new JFrame("search");
//        f.setBackground(Color.green);
//        f.setLayout(null);
//
//        l=new JLabel("Employee Id");
//        l.setVisible(true);
//        l.setBounds(40,50,250,30);
//        l.setForeground(Color.white);
//        Font F1=new Font("serif",Font.BOLD,25);
//        l.setFont(F1);
//        f.add(l);
//
//        t=new JTextField();
//        t.setBounds(240,50,220,30);
//        f.add(t);
//
//        b=new JButton("Search");
//        b.setBounds(240,150,100,30);
//        b.addActionListener(this);
//        f.add(b);
//
//
//        b2=new JButton("Cancel");
//        b2.setBounds(360,150,100,30);
//        b2.addActionListener(this);
//        f.add(b2);
//
//        f.setSize(500,270);
//        f.setLocation(450,250);
//        f.setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource()==b2){
//            f.setVisible(false);
//            Details d=new Details();
//        }
//        if(ae.getSource()==b){
//            new UpdateEmployee(t.getText());
//            f.setVisible(false);
//        }
//
//    }
//
//    public static void main(String[]ar){
//        new SearchEmployee();
//    }
//}