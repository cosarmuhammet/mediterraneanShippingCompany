package dao;

import entity.Harbor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class HarborDAO extends DBConnection {

    private Connection db;

    public void HarborDAO(Harbor c) {
        try {

            Statement st = this.getDb().createStatement();

            String query = "insert into harbor (harbor_id, country_id, harbor_name, contract_dates, contract_duration) values('" + c.getHarbor_id() + "','" + c.getCountry_id() + "', '" + c.getHarbor_name() + "', '" + c.getContract_dates() + "', '" + c.getContract_duration() + "')";//BURDAKİ İSİSMLER PGADMİNDEKİ  TABLO SÜTUNLARIYLA AYNI OLMAK ZORUNDA c.get******** de classtaki değişkenlelerle atyynı olmak zorunda

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(Harbor c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "update harbor set country_id='" + c.getCountry_id() + "',harbor_name='" + c.getHarbor_name() + "',contract_dates='" + c.getContract_dates() + "', contract_duration='" + c.getContract_duration() + "'   where harbor_id='" + c.getHarbor_id() + "' ";
            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void delete(Harbor c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from harbor where harbor_id='" + c.getHarbor_id() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Harbor> getCategoryList() {

        List<Harbor> categoryList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from harbor order by harbor_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                categoryList.add(new Harbor(rs.getString("harbor_id"), rs.getString("country_id"), rs.getString("harbor_name"), rs.getString("contract_Dates"), rs.getString("contract_Duration")));///BURDAKİ İSİSMLER PGADMİNDEKİ  TABLO SÜTUNLARIYLA AYNI OLMAK ZORUNDA
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
