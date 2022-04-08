package util;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DBConnection {

    public Connection connect() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GemiTasimaciligi", "root", "12345");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

}
