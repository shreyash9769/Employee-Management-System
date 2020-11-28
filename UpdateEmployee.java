package com.academy;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class UpdateEmployee extends JavaOop implements ActionListener {
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3;
    String id_emp;
    static int u=0;
    public UpdateEmployee(String idaa){
        f=new JFrame("Update Employee details");
        f.setVisible(false);
        f.setSize(1150,700);
        f.setLocation(450,250);
        f.setBackground(Color.white);
        f.setLayout(null);

        id_emp=idaa;
        id15=new JLabel();
        id15.setBounds(0,0,1150,700);
        id15.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("com/academy/icons/addE.jpg"));
        Image image=img.getImage().getScaledInstance(1150,700,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(image);
        id15.setIcon(i2);
        f.add(id15);

        label(id15,id8,"Update Employee Details",290,10,600,80,Font.BOLD,50);
        label(id15,id1,"First Name",140,140);
        label(id15,id2,"Last Name",140,220);
        label(id15,id3,"DOB",140,300);
        label(id15,id4,"Age",140,380);
        label(id15,id5,"Email",600,140);
        label(id15,id6,"Address",600,220);
        label(id15,id7,"Post",600,300);
        label(id15,id9,"Employee Id",600,380);

        t1=textField(id15,300,140,t1);
        t2=textField(id15,300,220,t2);
        t3=textField(id15,300,300,t3);
        t4=textField(id15,300,380,t4);
        t5=textField(id15,800,140,t5);
        t6=textField(id15,800,220,t6);
        t7=textField(id15,800,300,t7);
        t8=textField(id15,800,380,t8);

        b=button(id15,b,"Update",380,500);
        b.addActionListener(this);
        b1=button(id15,b1,"Cancel",610,500);
        b1.addActionListener(this);
        showData(idaa);
    }

    int i=0;

    void showData(String s){
        try{
            Connect con = new Connect();
            String str = "select * from employee where emp_id = '"+s+"'";
            ResultSet rs = con.st.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(5));
                t6.setText(rs.getString(6));
                t7.setText(rs.getString(7));
                t8.setText(rs.getString(8));
            }
            if(i==0) {
                JOptionPane.showMessageDialog(null, "Id not found");
                new SearchEmployee();
            }
        }catch(Exception ex){}
        f.setLocation(200,50);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                Connect con = new Connect();
                String str = "update employee set emp_fname='"+t1.getText()+"',emp_lname='"+t2.getText()+"',dob='"+t3.getText()+"',age='"+t4.getText()+"',email='"+t5.getText()+"',address='"+t6.getText()+"',post='"+t7.getText()+"',emp_id='"+t8.getText()+"' where emp_id='"+id_emp+"'";
                con.st.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                u=1;
                new SearchEmployee();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            u=1;
            Details d=new Details();
        }
    }
}





//public class UpdateEmployee extends JavaOop implements ActionListener {
//    JFrame f;
//    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1;
//    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
//    JButton b,b1,b2,b3;
//    String id_emp;
//
//    public UpdateEmployee(String idaa){
//        //super(0);
//        f=new JFrame("update Employee details");
//        f.setVisible(true);
//        f.setSize(900,500);
//        f.setLocation(450,250);
//        f.setBackground(Color.white);
//        f.setLayout(null);
//
//        id_emp=idaa;
//        id15=new JLabel();
//        id15.setBounds(0,0,900,500);
//        id15.setLayout(null);
//        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("com/academy/icons/addE.jpg"));
//        id15.setIcon(img);
//
//        //label(f,id8,"Update Employee Details:",50,10,500,20);
//        id8 = new JLabel("Update Employee Details:");
//        id8.setBounds(50,10,500,50);
//        id8.setFont(new Font("serif",Font.ITALIC,40));
//        id8.setForeground(Color.black);
//        id15.add(id8);
//        f.add(id15);
//
//
//        id1 = new JLabel("FName:");
//        id1.setBounds(50,100,100,30);
//        id1.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id1);
//
//        t1=new JTextField();
//        t1.setBounds(200,100,150,30);
//        id15.add(t1);
//
//        id2 = new JLabel("LName:");
//        id2.setBounds(400,100,200,30);
//        id2.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id2);
//
//        t2=new JTextField();
//        t2.setBounds(600,100,150,30);
//        id15.add(t2);
//
//        id3= new JLabel("DOB:");
//        id3.setBounds(50,150,100,30);
//        id3.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id3);
//
//        t3=new JTextField();
//        t3.setBounds(200,150,150,30);
//        id15.add(t3);
//
//        id4= new JLabel("Age:");
//        id4.setBounds(400,150,100,30);
//        id4.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id4);
//
//        t4=new JTextField();
//        t4.setBounds(600,150,150,30);
//        id15.add(t4);
//
//        id5= new JLabel("Email Id:");
//        id5.setBounds(50,200,100,30);
//        id5.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id5);
//
//        t5=new JTextField();
//        t5.setBounds(200,200,150,30);
//        id15.add(t5);
//
//        id6= new JLabel("Address:");
//        id6.setBounds(400,200,100,30);
//        id6.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id6);
//
//        t6=new JTextField();
//        t6.setBounds(600,200,150,30);
//        id15.add(t6);
//
//        id7= new JLabel("Post:");
//        id7.setBounds(50,250,100,30);
//        id7.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id7);
//
//        t7=new JTextField();
//        t7.setBounds(200,250,150,30);
//        id15.add(t7);
//
//        id9= new JLabel("Employee Id:");
//        id9.setBounds(400,250,100,30);
//        id9.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id9);
//
//        t8=new JTextField();
//        t8.setBounds(600,250,150,30);
//        id15.add(t8);
//
//        b=new JButton("update");
//        b.setBounds(250,400,100,30);
//        b.addActionListener(this);
//        id15.add(b);
//
//        b1=new JButton("Cancel");
//        b1.setBounds(450,400,100,30);
//        b1.addActionListener(this);
//        id15.add(b1);
//
//        showData(idaa);
//    }
//
//    int i=0;
//
//    void showData(String s){
//        try{
//            Connect con = new Connect();
//            String str = "select * from employee where emp_id = '"+s+"'";
//            ResultSet rs = con.st.executeQuery(str);
//
//            if(rs.next()){
//                f.setVisible(true);
//                i=1;
//
//                t1.setText(rs.getString(1));
//                t2.setText(rs.getString(2));
//                t3.setText(rs.getString(3));
//                t4.setText(rs.getString(4));
//                t5.setText(rs.getString(5));
//                t6.setText(rs.getString(6));
//                t7.setText(rs.getString(7));
//                t8.setText(rs.getString(8));
//            }
//            if(i==0)
//                JOptionPane.showMessageDialog(null,"Id not found");
//            new SearchEmployee();
//        }catch(Exception ex){}
//        f.setVisible(true);
//        f.setSize(900,500);
//        f.setLocation(400,100);
//    }
//
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource()==b && i==1){
//            try{
//                Connect con = new Connect();
//                String str = "update employee set emp_fname='"+t1.getText()+"',emp_lname='"+t2.getText()+"',dob='"+t3.getText()+"',age='"+t4.getText()+"',email='"+t5.getText()+"',address='"+t6.getText()+"',post='"+t7.getText()+"',emp_id='"+t8.getText()+"' where emp_id='"+id_emp+"'";
//                con.st.executeUpdate(str);
//                JOptionPane.showMessageDialog(null,"successfully updated");
//                f.setVisible(false);
//                new SearchEmployee();
//            }catch(Exception e){
//                System.out.println("The error is:"+e);
//            }
//        }
//        if(ae.getSource()==b1){
//            f.setVisible(false);
//            Details d=new Details();
//        }
//    }
//
//    public static void main(String[] arg){
//        new UpdateEmployee("Update Employee");
//    }
//}