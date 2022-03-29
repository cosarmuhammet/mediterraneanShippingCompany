package entity;

public class Ship {

    private String ship_id;
    private String name;
    private String lenght;
    private String height;
    private String production_date;
    private String capacity;

    public Ship() {

    }

    public Ship(String ship_ID, String name, String lenght, String height, String production_date, String capacity) {
        this.ship_id = ship_ID;
        this.name = name;
        this.lenght = lenght;
        this.height = height;
        this.production_date = production_date;
        this.capacity = capacity;
    }

    public String getShip_id() {
        return ship_id;
    }

    public void setShip_id(String ship_id) {
        this.ship_id = ship_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getProduction_date() {
        return production_date;
    }

    public void setProduction_date(String production_date) {
        this.production_date = production_date;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Ship{" + "ship_ID=" + ship_id + ", name=" + name + ", uzunluk=" + lenght + ", height=" + height + ", production_date=" + production_date + ", capacity=" + capacity + '}';
    }

}
