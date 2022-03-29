package dao;

import entity.Ship;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class ShipDAO extends DBConnection {

    private Connection db;

    public void ShipDAO(Ship c) {
        try {

            Statement st = this.getDb().createStatement();

            String query = "insert into ship (ship_id, ship_name, length, height ,production_date,capacity) values('" + c.getShip_id() + "', '" + c.getName() + "', '" + c.getLenght() + "', "
                    + "'" + c.getHeight() + "' ,'" + c.getProduction_date() + "' ,'" + c.getCapacity() + "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Ship c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from ship where ship_id='" + c.getShip_id() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Ship> getCategoryList() {

        List<Ship> categoryList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from ship order by ship_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Ship(rs.getString("ship_id"), rs.getString("ship_name"), rs.getString("length"), rs.getString("height"), rs.getString("production_date"), rs.getString("capacity")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return categoryList;
    }

    public Connection getDb() {
        if (this.db == null) {
            this.db = this.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

}
