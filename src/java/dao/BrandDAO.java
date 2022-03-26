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

            String query = "insert into brand (brand_ID, name, contract_dates, contract_duration) values('"+c.getBrand_ID()+"', '"+c.getName()+"', '" + c.getContract_Dates()+"', '"+ c.getContract_Duration()+ "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Brand c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from brand where brand_ID='" + c.getBrand_ID() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Brand> getCategoryList() {

        List<Brand> categoryList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from brand order by brand_ID";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Brand(rs.getString("brand_ID"), rs.getString("name"), rs.getString("contract_Dates"), rs.getString("contract_Duration")));
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
