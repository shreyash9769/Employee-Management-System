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
