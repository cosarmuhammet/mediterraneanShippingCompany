package dao;

import java.util.List;
import util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import entity.Company;

public class CompanyDAO extends DBConnection {

    private Connection db;

    public void CompanyDAO(Company c) {
        try {

            Statement st = this.getDb().createStatement();

            String query = "insert into company (company_id,company_name,company_type,founder,year_of_foundation) values('" + c.getCompany_ID() + "', '" + c.getCompany_Name() + "', '" + c.getCompany_type() + "', '" + c.getFounder() + "', '" + c.getYear_of_Foundation() + "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Company c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from company where company_id='" + c.getCompany_ID() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Company> getCategoryList() {

        List<Company> companyList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from company order by company_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                companyList.add(new Company(rs.getString("Company_ID"), rs.getString("Company_Name"), rs.getString("Company_type"), rs.getString("Founder"), rs.getString("Year_of_Foundation")));//Değişkenler company sınıfı içeerisindeki iismlerle aynı olacak
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return companyList;
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
