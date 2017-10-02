package export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by thetida on 9/29/17.
 */
public class ExpForm {
    public void doGet(Connection con) throws SQLException {

        ResultSet rs = null;


        String query = "select * " + "from Teamproject.Insurances ";

        try (Statement stmt = con.createStatement()) {
            rs = stmt.executeQuery(query);

            String n="";

            File file = new File("/home/thetida/Desktop/Code2.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            while (rs.next()) {


                bw.write(String.valueOf(rs.getInt("id")+" "+rs.getString("Plates")+"\n"));

            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
