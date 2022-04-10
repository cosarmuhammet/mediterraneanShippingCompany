package dao;

import entity.Brand;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class BrandDAO extends DBConnection {

    private Connection db;

    public void BrandDAO(Brand c) {
        try {

            Statement st = this.getDb().createStatement();

            String query = "insert into brand (brand_id,country_id, brand_name, contract_dates, contract_duration) values('" + c.getBrand_id() + "','" + c.getCountry_id() + "', '" + c.getBrand_name() + "', '" + c.getContract_Dates() + "', '" + c.getContract_Duration() + "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void update(Brand c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "update brand set country_id='" + c.getCountry_id() + "',brand_name='" + c.getBrand_name()+ "',contract_dates='" + c.getContract_Dates()+ "', contract_duration='" + c.getContract_Duration()+ "'   where brand_id='" + c.getBrand_id()+ "' ";
            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void delete(Brand c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from brand where brand_id='" + c.getBrand_id() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Brand> getCategoryList() {

        List<Brand> categoryList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from brand order by brand_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Brand(rs.getString("brand_id"), rs.getString("country_id"), rs.getString("brand_name"), rs.getString("contract_Dates"), rs.getString("contract_Duration")));
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
