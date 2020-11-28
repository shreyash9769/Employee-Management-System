package com.academy;

import java.sql.*;

public class Connect {
    Connection con;
    Statement st;
    public Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system", "root", "password");
            st = con.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
