//Your package

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrontPage implements ActionListener {
    JFrame j;
    JLabel id ;  //it is the test that appear on jframe
    JButton button;

    public FrontPage(){
        j=new JFrame("Employee Management System");
        j.setBackground(Color.red);
        j.setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Add path of your img here"));
        Image image=i1.getImage().getScaledInstance(960,689,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(image);
        JLabel l1=new JLabel(i2);
        l1.setBounds(0,100,1360,550);
        j.add(l1);

        button=new JButton("Click here to continue");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(500,650,300,50);
        button.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        id.add(button);

        JLabel lid=new JLabel("Employee Management System");
        lid.setBounds(250,0,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(lid);
        j.add(id);

        j.setVisible(true);//to show the frame
        j.setSize(1360,750);
        j.setLocation(200,50);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) { 
        if(actionEvent.getSource()==button){ 
            j.setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        FrontPage fp=new FrontPage();
    }
}
