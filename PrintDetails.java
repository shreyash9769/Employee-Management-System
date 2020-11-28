package com.academy;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class PrintDetails extends JavaOop implements ActionListener {
    JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    String emp_id, fname,lname,address,email,post,age,dob;
    JButton b1,b2;
    //static int p=0;
    int i=0;
    public PrintDetails(String e_id){
        try{
            Connect con = new Connect();
            String str = "select * from employee where emp_id = '"+e_id+"'";
            ResultSet rs= con.st.executeQuery(str);
            if(rs.next()) {
                i=1;
                fname = rs.getString(1);
                lname = rs.getString(2);
                dob = rs.getString(3);
                age = rs.getString(4);
                email = rs.getString(5);
                address = rs.getString(6);
                post = rs.getString(7);
                emp_id = rs.getString(8);
            }
            else{
                JOptionPane.showMessageDialog(null,"Id doest not exists");
                new ViewEmployee();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        if(i==1) {
            f = new JFrame("Print Data");
            f.setVisible(true);
            f.setSize(595, 642);
            f.setLocation(450, 200);
            f.setBackground(Color.white);
            f.setLayout(null);

            id8 = new JLabel("Employee Details");
            id8.setBounds(200, 10, 250, 30);
            id8.setFont(new Font("serif", Font.BOLD, 25));
            f.add(id8);

            label(f, id, "Employee Id:", 50, 70, 120, 20);
            label(f, aid, emp_id, 220, 70, 200, 20);
            label(f, id1, "First Name:", 50, 120, 120, 20);
            label(f, aid1, fname, 220, 120, 300, 20);
            label(f, id2, "Last Name:", 50, 170, 200, 20);
            label(f, aid2, lname, 220, 170, 300, 20);
            label(f, id3, "Address", 50, 220, 100, 20);
            label(f, aid3, address, 220, 220, 300, 20);
            label(f, id7, "Job Post:", 50, 270, 100, 20);
            label(f, aid7, post, 220, 270, 300, 20);
            label(f, id4, "Age:", 50, 320, 100, 20);
            label(f, aid4, age, 220, 320, 300, 20);
            label(f, id5, "Email Id", 50, 370, 100, 20);
            label(f, aid5, email, 220, 370, 300, 20);

            b1 = button(f, b1, "Print", 150, 450, 120, 40);
            b1.addActionListener(this);
            b2 = button(f, b2, "Cancel", 300, 450, 120, 40);
            b2.addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f.setVisible(false);
            //p=1;
            Details d=new Details();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            //p=1;
            new ViewEmployee();
        }
    }
//    public static void main(String[] args){
//        new PrintDetails("Print Data");
//    }
}





//public class PrintDetails extends JavaOop implements ActionListener {
//    JFrame f;
//    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
//    String emp_id, fname,lname,address,email,post,age,dob;
//    JButton b1,b2;
//
//    public PrintDetails(String e_id){
//        try{
//            Connect con = new Connect();
//            String str = "select * from employee where emp_id = '"+e_id+"'";
//            ResultSet rs= con.st.executeQuery(str);
//
//            while(rs.next()){
//
//
//                fname = rs.getString("emp_fname");
//                lname=rs.getString("emp_lname");
//                dob = rs.getString("dob");
//                age = rs.getString("age");
//                email = rs.getString("email");
//                address = rs.getString("address");
//                post = rs.getString("post");
//                emp_id = rs.getString("emp_id");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//        f=new JFrame("Print Data");
//        f.setVisible(true);
//        f.setSize(595,642);
//        f.setLocation(450,200);
//        f.setBackground(Color.white);
//        f.setLayout(null);
//
//        id8 = new JLabel("Employee Details");
//        id8.setBounds(50,10,250,30);
//        id8.setFont(new Font("serif",Font.BOLD,25));
//        f.add(id8);
//
//        //label(f,id,"Employee Id",50,70,120,20);
//        id = new JLabel("Employee Id:");
//        id.setBounds(50,70,120,30);
//        id.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id);
//
//        aid = new JLabel(emp_id);
//        aid.setBounds(200,70,200,30);
//        aid.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid);
//
//        id1 = new JLabel("First Name:");
//        id1.setBounds(50,120,100,30);
//        id1.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id1);
//
//        aid1 = new JLabel(fname);
//        aid1.setBounds(200,120,300,30);
//        aid1.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid1);
//
//
//        id2 = new JLabel("Last Name:");
//        id2.setBounds(50,170,200,30);
//        id2.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id2);
//
//        aid2 = new JLabel(lname);
//        aid2.setBounds(200,170,300,30);
//        aid2.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid2);
//
//        id3= new JLabel("Address:");
//        id3.setBounds(50,220,100,30);
//        id3.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id3);
//
//        aid3= new JLabel(address);
//        aid3.setBounds(200,220,300,30);
//        aid3.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid3);
//
//        id7= new JLabel("Job Post:");
//        id7.setBounds(50,270,100,30);
//        id7.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id7);
//
//        aid7= new JLabel(post);
//        aid7.setBounds(200,270,300,30);
//        aid7.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid7);
//
//
//        id4= new JLabel("Age:");
//        id4.setBounds(50,320,100,30);
//        id4.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id4);
//
//        aid4= new JLabel(age);
//        aid4.setBounds(200,320,300,30);
//        aid4.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid4);
//
//
//        id5= new JLabel("Email Id:");
//        id5.setBounds(50,370,100,30);
//        id5.setFont(new Font("serif",Font.BOLD,20));
//        f.add(id5);
//
//        aid5= new JLabel(email);
//        aid5.setBounds(200,370,300,30);
//        aid5.setFont(new Font("serif",Font.BOLD,20));
//        f.add(aid5);
//
//
//        b1=new JButton("Print");
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
//        b1.setBounds(100,520,100,30);
//        b1.addActionListener(this);
//        f.add(b1);
//
//        b2=new JButton("cancel");
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
//        b2.setBounds(250,520,100,30);
//        b2.addActionListener(this);
//        f.add(b2);
//
//    }
//
//    public void actionPerformed(ActionEvent ae){
//
//        if(ae.getSource()==b1){
//            JOptionPane.showMessageDialog(null,"printed successfully");
//            f.setVisible(false);
//            Details d=new Details();
//        }
//        if(ae.getSource()==b2){
//            f.setVisible(false);
//            new ViewEmployee();
//        }
//    }
//    public static void main(String[] args){
//        new PrintDetails("Print Data");
//    }
//}
