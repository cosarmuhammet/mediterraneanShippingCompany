package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
    
    public Connection connect() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MSC", "root", "12345");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }
    
}

