package com.academy;

import javax.swing.*;
import java.awt.*;


public class JavaOop {

    public void label(JLabel label,JLabel l,String labelName, int x, int y){//AddEmp
        l=new JLabel(labelName);
        l.setBounds(x,y,150,40);
        l.setFont(new Font("serif",Font.PLAIN,30));
        l.setForeground(Color.BLACK);
        label.add(l);
    }
    public void label(JLabel label,JLabel l,String labelName,int x,int y,int width,int height, int boldOrPlain,int size) {//AddEmp//updateemp
        l=new JLabel(labelName);
        l.setBounds(x, y, width, height);
        l.setFont(new Font("serif", boldOrPlain, size));
        l.setForeground(Color.BLACK);
        label.add(l);
    }
    public JTextField textField(JLabel l,int x,int y,JTextField t){//AddEmp//updateemp
        t=new JTextField();
        t.setBounds(x,y,230,40);
        l.add(t);
        return t;
    }
    public JButton button(JLabel label,JButton b,String buttonName,int x,int y){//AddEmp//updateemp
        b=new JButton(buttonName);
        b.setBounds(x,y,150,50);
        b.setFont(new Font("serif",Font.PLAIN,25));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        label.add(b);
        return b;
    }
    public void label(JFrame f,JLabel l,String labelName, int x, int y,int width,int size){//printDetails
        l=new JLabel(labelName);
        l.setBounds(x,y,width,30);
        l.setFont(new Font("serif",Font.BOLD,20));
        f.add(l);
    }
    public JButton button(JFrame f,JButton b,String buttonName,int x,int y,int width,int height){//printDetails,deleteemp,searchemp
        b=new JButton(buttonName);
        b.setBounds(x,y,width,height);
        b.setFont(new Font("serif",Font.PLAIN,20));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        f.add(b);
        return b;
    }
    public JButton button(JLabel label,JButton b,String buttonName,int x,int y,int width,int height) {//ViewEmp
        b = new JButton(buttonName);
        b.setBounds(x, y, width, height);
        b.setFont(new Font("serif", Font.PLAIN, 20));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        label.add(b);
        return b;
    }
    public JLabel label(JFrame f,JLabel l,String labelName, int x, int y,int width){//deleteemp//searchemp
        l=new JLabel(labelName);
        l.setBounds(x,y,width,30);
        l.setFont(new Font("serif",Font.BOLD,20));
        f.add(l);
        return l;
    }
}
