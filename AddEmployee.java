//Your package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JavaOop implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    static int a=0;
    public AddEmployee(){
        f=new JFrame("Add Employee");
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,1150,700);
        l1.setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Add path to a image here"));
        Image image=i1.getImage().getScaledInstance(1150,700,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(image);
        l1.setIcon(i2);
        f.add(l1);

        label(l1,l2,"Enter Details",420,30,500,80,Font.BOLD,60);
        label(l1,l3,"First Name",140,140);
        label(l1,l4,"Last Name",140,220);
        label(l1,l5,"DOB",140,300);
        label(l1,l6,"Age",140,380);
        label(l1,l7,"Email",600,140);
        label(l1,l8,"Address",600,220);
        label(l1,l9,"Post",600,300);
        label(l1,l10,"Employee Id",600,380);

        t1=textField(l1,300,140,t1);
        t2=textField(l1,300,220,t2);
        t3=textField(l1,300,300,t3);
        t4=textField(l1,300,380,t4);
        t5=textField(l1,800,140,t5);
        t6=textField(l1,800,220,t6);
        t7=textField(l1,800,300,t7);
        t8=textField(l1,800,380,t8);

        b1=button(l1,b1,"Enter",380,500);
        b1.addActionListener(this);
        b2=button(l1,b2,"Cancel",610,500);
        b2.addActionListener(this);

        f.setLocation(100,50);
        f.setVisible(true);
        f.setSize(1150,700);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String s1=t1.getText();
        String s2=t2.getText();
        String s3=t3.getText();
        String s4=t4.getText();
        String s5=t5.getText();
        String s6=t6.getText();
        String s7=t7.getText();
        String s8=t8.getText();
        if(actionEvent.getSource()==b1){
            try{
                Connect connect=new Connect();
                String sql1="Insert into employee values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                connect.st.executeUpdate(sql1);
                JOptionPane.showMessageDialog(null,"Details Entered Successfully");
                f.setVisible(false);
                a=1;
                new Details();
            }
            catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error Occurred");
            }
        }
        else if(actionEvent.getSource()==b2){
            f.setVisible(false);
            a=1;
            new Details();
        }
    }
//    public static void main(String[] args){
//        AddEmployee addEmployee=new AddEmployee();
//    }
}
