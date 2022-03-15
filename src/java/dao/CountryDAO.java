package dao;

import entity.Country;
import java.util.List;
import util.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CountryDAO extends DBConnection{

    private Connection db;
    
    public void CountryDAO(Country c) {
        try {

            Statement st = this.getDb().createStatement();

            String query = "insert into country (country_ID, name) values('"+c.getCountry_ID()+"', '"+c.getName()+"')";
            
            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(Country c){
        
        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from country where country_ID='"+c.getCountry_ID()+"'";
            int r = st.executeUpdate(query2);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Country> getCategoryList() {

        List<Country> categoryList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from country order by country_ID";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Country(rs.getString("country_ID"), rs.getString("name")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return categoryList;
    }
    

    public Connection getDb() {
        if ( this.db == null ){
            this.db =this.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }
    
    
    
}
