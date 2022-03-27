package dao;

import entity.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class EmployeeDAO extends DBConnection {

    private Connection db;

    public void EmployeeDAO(Employee c) {
        try {
            Statement st = this.getDb().createStatement();

            String query = "insert into employee (employee_id,name,surname,date_of_birth,adress,jop_position,phone_number,travel_time,contract_duration,wage) values ('" + c.getEmployee_id() + "', '" + c.getName() + "', '" + c.getSurname() + "', '" + c.getDate_of_birth() + "','" + c.getAdress() + "','" + c.getJop_position() + "','" + c.getPhone_number() + "','" + c.getTravel_time() + "','" + c.getContract_duration() + "', '" + c.getWage() + "') ";
            int r = st.executeUpdate(query);  //OLUSTURMA İSLEMLERİ
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Employee c) {

        try {
            Statement st = this.getDb().createStatement();
            String query2 = "delete from employee where employee_id='" + c.getEmployee_id() + "'";
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Employee> getCategoryList() {

        List<Employee> EmployeeList = new ArrayList<>();

        try {
            Statement st = this.getDb().createStatement();

            String query = "select * from employee order by employee_id";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                EmployeeList.add(new Employee(rs.getString("employee_id"), rs.getString("name"), rs.getString("surname"), rs.getString("date_of_birth"), rs.getString("adress"), rs.getString("jop_position"), rs.getString("phone_number"), rs.getString("travel_time"), rs.getString("contract_duration"), rs.getString("wage")));//Değişkenler company sınıfı içeerisindeki iismlerle aynı olacak
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return EmployeeList;
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
