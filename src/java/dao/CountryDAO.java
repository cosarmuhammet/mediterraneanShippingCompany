package dao;

import entity.Country;
import java.util.List;
import util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CountryDAO extends DBConnection {

    private Connection db;

    public void CountryDAO(Country c) {
        try {

            Statement st = this.getConnection().createStatement();

            String query = "insert into country (country_id, country_name) values('" + c.getCountry_id() + "', '" + c.getCountry_name() + "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Country findbyID(String id) {
       
        Country c = null;
        try {
            Statement st = this.getConnection().createStatement();

            String query = "select * from country where country_id='" + id + "' ";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                c = new Country(rs.getString("country_id"), rs.getString("country_name"));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return c;

    }

    public void update(Country c) {
        try {

            Statement st = this.getConnection().createStatement();

            String query = "update country set country_name='" + c.getCountry_name() + "' where country_id='" + c.getCountry_id() + "'   ";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Country c) {

        try {
            Statement st = this.getConnection().createStatement();
            String query2 = "delete from country where country_id='" + c.getCountry_id() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Country> getCategoryList() {

        List<Country> categoryList = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();

            String query = "select * from country order by country_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Country(rs.getString("country_id"), rs.getString("country_name")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return categoryList;
    }

}
