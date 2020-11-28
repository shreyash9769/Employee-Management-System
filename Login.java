package com.academy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login implements ActionListener {
    JTextField t1;
    JTextField t2;
    JFrame f;
    JButton b1,b2;
    //static int l=0;
    public Login(){
        f=new JFrame("Login");
        f.setLayout(null);

        JLabel l1=new JLabel("Username");
        l1.setBounds(40,20,100,30);//40 dist from left side of login frame, 20 distance from upside of login frame
        f.add(l1);

        JLabel l2=new JLabel("Password");
        l2.setBounds(40,70,100,30);
        f.add(l2);

        t1=new JTextField();
        t1.setBounds(150,20,100,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,100,30);
        f.add(t2);

        b1=new JButton("Login");
        b1.setBounds(40,190,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(150,190,100,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        f.add(b2);

        f.setVisible(true);
        f.setSize(600,300);
        f.setLocation(400,300);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==b1) {
            try {
                Connect connect = new Connect();
                String s1 = t1.getText();//String representation of text entered;
                String s2 = t2.getText();
                String sql1 = "select * from login where username='" + s1 + "' and password='" + s2 + "'";
                ResultSet rs1 = connect.st.executeQuery(sql1);
                if (rs1.next()) {
                    new Details().f.setVisible(true);
                    f.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    f.setVisible(false);
                    new Login();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(actionEvent.getSource()==b2){
            f.setVisible(false);
            //l=1;
        }
    }
    public static void main(String[] args){
        Login login=new Login();
    }
}
