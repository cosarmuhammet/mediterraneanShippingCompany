package dao;

import entity.Ship;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class ShipDAO extends DBConnection {

  

    public void ShipDAO(Ship c) {
        try {

            Statement st = this.getConnection().createStatement();

            String query = "insert into ship (ship_id,employee_id, ship_name, dimension ,production_date,capacity) values('" + c.getShip_id() + "','" + c.getEmployee_id() + "', '" + c.getShip_name() + "', '" + c.getDimension() + "', "
                    + "'" + c.getProduction_date() + "' ,'" + c.getCapacity() + "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(Ship c) {
        try {
            Statement st = this.getConnection().createStatement();

            String query = "update ship set employee_id='" + c.getEmployee_id() + "',ship_name='" + c.getShip_name() + "' ,dimension='" + c.getDimension() + "',production_date='" + c.getProduction_date() + "', capacity='" + c.getCapacity() + "'where ship_id='" + c.getShip_id() + "' ";
            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void delete(Ship c) {

        try {
            Statement st = this.getConnection().createStatement();
            String query2 = "delete from ship where ship_id='" + c.getShip_id() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Ship> getCategoryList() {

        List<Ship> categoryList = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();

            String query = "select * from ship order by ship_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Ship(rs.getString("ship_id"), rs.getString("employee_id"), rs.getString("ship_name"), rs.getString("dimension"), rs.getString("production_date"), rs.getString("capacity")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return categoryList;
    }


}
