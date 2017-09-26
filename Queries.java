package databasequeries;

import java.sql.*;

/**
 * Created by thetida on 9/26/17.
 */
public class Queries {
    public void getVehiclesByTimeframe (Connection con)throws SQLException {

        String query = "select * " + "from Teamproject.Insurances " + " where ExpDate >= '2017/08/11' and ExpDate <= '2017/12/12'";

        try (Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                String plates = rs.getString("Plates");
                String expirationDay = rs.getString("ExpDate");

                System.out.println(plates + ", " + expirationDay);
            }
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
    }
}
