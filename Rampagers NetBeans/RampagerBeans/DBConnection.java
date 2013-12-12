package jespringer.RahalRampagers;
import java.io.*;
import java.sql.*;

public class DBConnection implements Serializable {
        public static Connection openDBConnection() {
        try {
            // Load driver and link to driver manager
            Class.forName("com.mysql.jdbc.Driver");
            // Create a connection to the specified database
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://devsrv.cs.csbsju.edu:3306/RahalRampagers", "KKutzke", "KKutzke");
            return myConnection;
        } catch (Exception E) {
            E.printStackTrace();
        }
        return null;
    }
}
