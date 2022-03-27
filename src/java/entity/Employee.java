package entity;

public class Employee {

    private String employee_id;
    private String name;
    private String surname;
    private String date_of_birth;
    private String adress;
    private String jop_position;
    private String phone_number;
    private String travel_time;
    private String contract_duration;
    private String wage;

    public Employee() {
    }

    public Employee(String employee_id, String name, String surname, String date_of_birth, String adress, String jop_position, String phone_number, String travel_time, String contract_duration, String wage) {
        this.employee_id = employee_id;
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.adress = adress;
        this.jop_position = jop_position;
        this.phone_number = phone_number;
        this.travel_time = travel_time;
        this.contract_duration = contract_duration;
        this.wage = wage;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getJop_position() {
        return jop_position;
    }

    public void setJop_position(String jop_position) {
        this.jop_position = jop_position;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getTravel_time() {
        return travel_time;
    }

    public void setTravel_time(String travel_time) {
        this.travel_time = travel_time;
    }

    public String getContract_duration() {
        return contract_duration;
    }

    public void setContract_duration(String contract_duration) {
        this.contract_duration = contract_duration;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

}
