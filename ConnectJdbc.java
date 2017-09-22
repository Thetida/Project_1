package com;

import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectJdbc {
    public void Connectiondb(){

        try {

            String host = "jdbc:mysql://localhost:3306/Teamproject";
            String username = "root";
            String password = "root";


            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(host, username, password);

            }
        catch ( Exception err ) {
            System.out.println( err.getMessage( ) );
        }
    }
}
