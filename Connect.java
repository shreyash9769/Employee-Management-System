//Your package;

import java.sql.*;

public class Connect {
    Connection con;
    Statement st;
    public Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/name_of_the_database", "Enter your user here", "Enter your password here");
            st = con.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
