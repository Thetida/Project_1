package com;

import java.sql.*;


public class ConnectJdbc {
    public Connection Connectiondb() {
        Connection con=null;
        try {


            String host = "jdbc:mysql://localhost:3306/Teamproject";
            String username = "root";
            String password = "root";


            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(host, username, password);

            }
        catch ( Exception err ) {
            System.out.println( err.getMessage( ) );
        }
        return con;
    }

}
