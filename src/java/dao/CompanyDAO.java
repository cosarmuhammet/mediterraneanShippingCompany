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

            String query = "insert into company (company_id,ship_id,country_id, company_name,company_type,founder,year_of_foundation) values('" + c.getCompany_id()+ "', '"+c.getShip_id()+"','"+c.getCountry_id()+"', '" + c.getCompany_name()+ "', '" + c.getCompany_type() + "', '" + c.getFounder() + "', '" + c.getYear_of_foundation() + "')";

            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
      public void update(Company c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "update company set ship_id='" + c.getShip_id()+ "',country_id='"+c.getCountry_id()+"' ,company_name='" + c.getCompany_name()+ "',company_type='" + c.getCompany_type()+ "', founder='" + c.getFounder()+ "', year_of_foundation='"+c.getYear_of_foundation()+"'   where company_id='" + c.getCompany_id()+ "' ";
            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void delete(Company c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from company where company_id='" + c.getCompany_id() + "'";
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

                companyList.add(new Company(rs.getString("company_id"),rs.getString("ship_id"),rs.getString("country_id") ,rs.getString("company_name"), rs.getString("company_type"), rs.getString("founder"), rs.getString("year_of_foundation")));
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
