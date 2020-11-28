package com.academy;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class DeleteEmployee extends JavaOop implements ActionListener {
    JFrame f;
    JTextField t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2,b3;
    static int del=0;

    public DeleteEmployee(){
        f=new JFrame("Remove Employee");
        f.setBackground(Color.green);
        f.setLayout(null);

        label(f,l1,"Employee Id",100,50,250,20);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        f.add(t);

        b=button(f,b,"Search",100,100,100,30);
        b.addActionListener(this);
        b3=button(f,b3,"Back",250,100,100,30);
        b3.addActionListener(this);

        l2=label(f,l2,"FName:",100,150,250);
        l6=label(f,l6,"",250,150,350);
        l3=label(f,l3,"LName:",100,200,250);
        l7=label(f,l7,"",250,200,350);
        l4=label(f,l4,"Email Id:",100,250,250);
        l8=label(f,l8,"",250,250,350);

        b1=button(f,b1,"Remove",100,300,110,30);
        b1.addActionListener(this);
        b2=button(f,b2,"Cancel",250,300,110,30);
        b2.addActionListener(this);

        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);

        f.setSize(500,500);
        f.setLocation(500,250);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            try{
                Connect con = new Connect();
                String str = "select emp_fname,emp_lname,email from employee where emp_id ='"+t.getText()+"' ";
                ResultSet rs = con.st.executeQuery(str);

                int i=0;
                if(rs.next()){
                    String fname = rs.getString(1);
                    String lname=rs.getString(2);
                    String email=rs.getString(3);

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    b1.setVisible(true);
                    b2.setVisible(true);
                    i=1;
                    l6.setText(fname);
                    l7.setText(lname);
                    l8.setText(email);
                }
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
                del=1;
            }catch(Exception ex){}

        }
        if(ae.getSource()==b1){
            try{
                Connect con = new Connect();
                String str = "delete from employee where emp_id = '"+t.getText()+"'";
                con.st.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"deleted successfully");
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                b1.setVisible(false);
                b2.setVisible(false);
                del=1;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occured while delting record "+ex);
            }
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            del=1;
            Details d=new Details();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            del=1;
            Details d=new Details();
        }
    }

//    public static void main(String[]ar){
//        new DeleteEmployee();
//    }
}




//public class DeleteEmployee extends JavaOop implements ActionListener {
//    JFrame f;
//    JTextField t;
//    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
//    JButton b,b1,b2,b3;
//
//
//    public DeleteEmployee(){
//        f=new JFrame("Remove Employee");
//        f.setBackground(Color.green);
//        f.setLayout(null);
//
//        //label(f,l1,"Employee Id",50,50,250,20);
//        l1=new JLabel("Employee Id");
//        l1.setBounds(50,50,250,30);
//        l1.setForeground(Color.black);
//        Font f2 = new Font("serif",Font.BOLD,25);
//        l1.setFont(f2);
//        f.add(l1);
//
//        t=new JTextField();
//        t.setBounds(250,50,150,30);
//        f.add(t);
//
//
//        b=new JButton("Search");
//        b.setBounds(200,100,100,30);
//        b.addActionListener(this);
//        f.add(b);
//
//        b3=new JButton("back");
//        b3.setBounds(360,100,100,30);
//        b3.addActionListener(this);
//        f.add(b3);
//
//
//        l2=new JLabel("FName:");
//        l2.setBounds(50,150,250,30);
//        l2.setForeground(Color.black);
//        Font f3 = new Font("serif",Font.BOLD,20);
//        l2.setFont(f3);
//        f.add(l2);
//
//        l6=new JLabel();
//        l6.setBounds(200,150,350,30);
//        l6.setForeground(Color.black);
//        Font F6=new Font("serif",Font.BOLD,20);
//        l6.setFont(F6);
//        f.add(l6);
//
//        l3=new JLabel("LName:");
//        l3.setBounds(50,200,250,30);
//        l3.setForeground(Color.black);
//        l3.setFont(new Font("serif",Font.BOLD,20));
//        f.add(l3);
//
//        l7=new JLabel();
//        l7.setBounds(200,200,350,30);
//        l7.setForeground(Color.black);
//        l7.setFont(new Font("serif",Font.BOLD,20));
//        f.add(l7);
//
//        l4=new JLabel("Email Id:");
//        l4.setBounds(50,250,250,30);
//        l4.setForeground(Color.black);
//        Font F5=new Font("serif",Font.BOLD,20);
//        l4.setFont(F5);
//        f.add(l4);
//
//        l8=new JLabel();
//        l8.setBounds(200,250,350,30);
//        l8.setForeground(Color.black);
//        Font f8=new Font("serif",Font.BOLD,20);
//        l8.setFont(f8);
//        f.add(l8);
//
//        b1=new JButton("Remove");
//        b1.setBounds(120,300,100,30);
//        b1.addActionListener(this);
//        f.add(b1);
//
//
//        b2=new JButton("Cancel");
//        b2.setBounds(300,300,100,30);
//        b2.addActionListener(this);
//        f.add(b2);
//        l2.setVisible(false);
//        l3.setVisible(false);
//        l4.setVisible(false);
//        b1.setVisible(false);
//        b2.setVisible(false);
//
//        f.setSize(500,500);
//        f.setLocation(500,250);
//        f.setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae){
//
//        if(ae.getSource()==b){
//            try{
//                Connect con = new Connect();
//                String str = "select emp_fname,emp_lname,email from employee where emp_id ='"+t.getText()+"' ";
//                ResultSet rs = con.st.executeQuery(str);
//
//                int i=0;
//                if(rs.next()){
//                    String fname = rs.getString(1);
//                    String lname=rs.getString(2);
//                    String email=rs.getString(3);
//
//                    l2.setVisible(true);
//                    l3.setVisible(true);
//                    l4.setVisible(true);
//                    b1.setVisible(true);
//                    b2.setVisible(true);
//                    i=1;
//                    l6.setText(fname);
//                    l7.setText(lname);
//                    l8.setText(email);
//                }
//                if(i==0)
//                    JOptionPane.showMessageDialog(null,"Id not found");
//            }catch(Exception ex){}
//        }
//        if(ae.getSource()==b1){
//            try{
//                Connect con = new Connect();
//                String str = "delete from employee where emp_id = '"+t.getText()+"'";
//                con.st.executeUpdate(str);
//                JOptionPane.showMessageDialog(null,"deleted successfully");
//                l2.setVisible(false);
//                l3.setVisible(false);
//                l4.setVisible(false);
//                l6.setVisible(false);
//                l7.setVisible(false);
//                l8.setVisible(false);
//                b1.setVisible(false);
//                b2.setVisible(false);
//
//            }catch(Exception ex){
//                JOptionPane.showMessageDialog(null,"Exception occured while delting record "+ex);
//            }
//        }
//        if(ae.getSource()==b2){
//            f.setVisible(false);
//            Details d=new Details();
//        }
//        if(ae.getSource()==b3){
//            f.setVisible(false);
//            Details d=new Details();
//        }
//    }
//
//    public static void main(String[]ar){
//        new DeleteEmployee();
//    }
//}
